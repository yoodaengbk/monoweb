package com.mono.core.common.utils;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UploadUtil {
    private final int maxMemorySize = 1024 * 1024 * 3; //3MB
    private final int maxRequestSize = 1024 * 1024 * 50; //50MB

    public Object[] writeOrUploadFile(HttpServletRequest request, Set<String> titleValue, String path) throws Exception {

        ServletContext context = request.getServletContext();
        String adress = context.getRealPath("images");
        // Check that we have a file upload request
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (!isMultipart) {
            System.out.println("have not enctype multipart/form-data ");
        //            check = false;
        }
        // Create a factory for disk-based file items
        DiskFileItemFactory factory = new DiskFileItemFactory();

        // Set factory constraints
        factory.setSizeThreshold(maxMemorySize);
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

        // Create a new file upload handler
        ServletFileUpload upload = new ServletFileUpload(factory);

        // Set overall request size constraint
        upload.setSizeMax(maxRequestSize);

        boolean check = true;
        String fileLocation = null;
        String name = null;
        String fileName = "";
        Map<String, String> mapReturnValue = new HashMap<String,String>();
        try {
            // Parse the request
            List<FileItem> items = upload.parseRequest(request);
            for (FileItem item : items) {
                if (!item.isFormField()) {
                    fileName = item.getName();
                    File uploadFile = new File(adress + File.separator + path + File.separator + fileName);
                    System.out.println(adress + File.separator + path + File.separator + fileName);
                    fileLocation = adress + File.separator + path + File.separator + fileName;
                    try {
                        boolean isExist = uploadFile.exists();
                        if (isExist) {
                            uploadFile.delete();
                        }
                        item.write(uploadFile);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else {
                    if(titleValue != null) {
                        String nameField = item.getFieldName();
                        String valueField = item.getString();
                        if(titleValue.contains(nameField)) {
                            mapReturnValue.put(nameField,valueField);
                        }
                    }
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        return new Object[]{check, fileLocation, fileName, mapReturnValue};
    }
}
