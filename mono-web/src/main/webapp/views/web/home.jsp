<%--
  Created by IntelliJ IDEA.
  User: TAM TRUONG
  Date: 3/28/2021
  Time: 5:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<div class="home-banner">
    <div id="myCarousel" class="carousel slide " data-ride="carousel">

        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner ">
            <div class="carousel-item active">
                <img class="d-block w-100" src="/template/images/slider-1.jpg" alt="first-slider">
                <div class="carousel-caption d-none d-md-block text-left" style="margin-bottom: 5%;">
                    <p>MONA TRAVEL – ĐI VÀ TRẢI NGHIỆM MỌI THỨ</p>
                    <h2>ĐỒNG HÀNH CÙNG BẠN </h2>
                    <h2> MỌI NẺO ĐƯỜNG</h2>
                </div>
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="/template/images/slider-2.jpeg" alt="second-slider">
                <div class="carousel-caption d-none d-md-block text-left" style="margin-bottom: 5%;">
                    <p>MONA TRAVEL – ĐI VÀ TRẢI NGHIỆM MỌI THỨ</p>
                    <h2>ĐỒNG HÀNH CÙNG BẠN </h2>
                    <h2> MỌI NẺO ĐƯỜNG</h2>
                </div>
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="/template/images/1-1.jpeg" alt="thirds-slider">
                <div class="carousel-caption d-none d-md-block text-left" style="margin-bottom: 5%;">
                    <p>MONA TRAVEL – ĐI VÀ TRẢI NGHIỆM MỌI THỨ</p>
                    <h2>ĐỒNG HÀNH CÙNG BẠN </h2>
                    <h2> MỌI NẺO ĐƯỜNG</h2>
                </div>
            </div>
        </div>

        <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
            <span class="carousel-control-next-icon " aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>
<section class="home-world " style="margin-top: 4%;">
    <p class="text-center">Những điểm đến trên cả tuyệt vời</p>
    <h2 class="text-center" style="margin-bottom: 30px;">THIÊN ĐƯỜNG HỘI TỤ</h2>

    <!--Carousel Wrapper-->
    <div id="multi-item-example" class="carousel slide carousel-multi-item  col-md-9 ml-auto mr-auto"
         data-ride="carousel">

        <!--Slides-->
        <div class="carousel-inner ml-auto mr-auto" role="listbox">

            <!--First slide-->
            <div class="carousel-item text-center active">

                <div class="row ">
                    <div class="col-md-4">
                        <img class="rounded-circle" width="250" height="250" src="/template/images/25816508131_00e16429b8_o.jpg" alt="">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>CANADA</h5>
                        </div>
                    </div>
                    <div class="col-md-4 clearfix d-none d-md-block">
                        <img class="rounded-circle" width="250" height="250" src="/template/images/26003147786_a04226cd2f_o.jpg" alt="">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>BRAZIL</h5>
                        </div>
                    </div>

                    <div class="col-md-4 clearfix d-none d-md-block">
                        <img class="rounded-circle" width="250" height="250" src="/template/images/thumb-cuba.jpg" alt="">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>CUBA</h5>
                        </div>
                    </div>
                </div>

            </div>
            <!--/.First slide-->

            <!--Second slide-->
            <div class="carousel-item text-center">

                <div class="row">
                    <div class="col-md-4">

                        <img class="rounded-circle" width="250" height="250" src="/template/images/25656857141_edcdf5e6e3_o.jpg" alt="">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>ITALY</h5>
                        </div>
                    </div>

                    <div class="col-md-4 clearfix d-none d-md-block">

                        <img class="rounded-circle" width="250" height="250" src="/template/images/washington_dc.jpg" alt="..">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>USA</h5>
                        </div>
                    </div>

                    <div class="col-md-4 clearfix d-none d-md-block">

                        <img class="rounded-circle" width="250" height="250" src="/template/images/photo-1474181487882-5abf3f0ba6c2.jpg"
                             alt="">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>PHILIPPINES</h5>
                        </div>
                    </div>
                </div>

            </div>
            <!--/.Second slide-->

        </div>
        <!--/.Slides-->

        <a class="carousel-control-prev" href="#multi-item-example" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon " aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#multi-item-example" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>

    </div>
    <!--/.Carousel Wrapper-->

</section>


<section class="home-inland" style="margin-top: 50px; padding-bottom: 50px;">
    <p class="text-center">Chọn ngay cho bạn tour phù hợp</p>
    <h2 class="text-center" style="margin-bottom: 30px;">TOUR NỘI ĐỊA</h2>

    <!--Carousel Wrapper-->
    <div id="multi-item-inland" class="carousel slide carousel-multi-item col-md-9 ml-auto mr-auto"
         data-ride="carousel">



        <!--Indicators-->
        <ol class="carousel-indicators">
            <li data-target="#multi-item-inland" data-slide-to="0" class="active"></li>
            <li data-target="#multi-item-inland" data-slide-to="1"></li>
            <li data-target="#multi-item-inland" data-slide-to="2"></li>
        </ol>
        <!--/.Indicators-->

        <!--Slides-->
        <div class="carousel-inner" role="listbox">

            <!--First slide-->
            <div class="carousel-item active">

                <div class="row">
                    <div class="col-md-4">
                        <div class="card mb-2">
                            <img class="card-img-top" src="/template/images/bana5.jpg" alt="">
                            <div class="card-body">
                                <h4 class="card-title">DU LỊCH ĐÀ NẴNG</h4>
                                <p class="card-text">TOUR MIỀN TRUNG , TẶNG VÉ CÁP TREO, BUFFET</p>
                                <div>
                      <span class="price">4,699,000
                        <span class="currency">₫</span>
                      </span>
                                </div>

                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 clearfix d-none d-md-block">
                        <div class="card mb-2">
                            <img class="card-img-top" src="/template/images/lang-hoa.jpg" alt="">
                            <div class="card-body">
                                <h4 class="card-title">DU LỊCH MIỀN BẮC</h4>
                                <p class="card-text">DU LỊCH MIỀN BẮC - SAPA - FANSIPAN 5 NGÀY</p>
                                <div>
                      <span class="price">10,999,000
                        <span class="currency">₫</span>
                      </span>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 clearfix d-none d-md-block">
                        <div class="card mb-2">
                            <img class="card-img-top" src="/template/images/hue.jpg" alt="">
                            <div class="card-body">
                                <h4 class="card-title">DU LỊCH HẠ LONG</h4>
                                <p class="card-text">TOUR MIỀN BẮC - HÀ NỘI - HẠ LONG - SAPA </p>
                                <div>
                      <span class="price">7,599,000
                        <span class="currency">₫</span>
                      </span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <!--/.First slide-->

            <!--Second slide-->
            <div class="carousel-item">

                <div class="row">
                    <div class="col-md-4">
                        <div class="card mb-2">
                            <img class="card-img-top"
                                 src="https://mdbootstrap.com/img/Photos/Horizontal/City/4-col/img%20(60).jpg" alt="">
                            <div class="card-body">
                                <h4 class="card-title">DU LỊCH CÔN ĐẢO</h4>
                                <p class="card-text">DU LỊCH CÔN ĐẢO 2 NGÀY 1 ĐÊM BAY TỪ SÀI GÒN</p>
                                <div>
                      <span class="price">5,299,000
                        <span class="currency">₫</span>
                      </span>
                                </div>

                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 clearfix d-none d-md-block">
                        <div class="card mb-2">
                            <img class="card-img-top"
                                 src="https://mdbootstrap.com/img/Photos/Horizontal/City/4-col/img%20(47).jpg" alt="">
                            <div class="card-body">
                                <h4 class="card-title">DU LỊCH MIỀN NAM</h4>
                                <p class="card-text">DU LỊCH PHÚ QUỐC - NAM ĐẢO 3 NGÀY 2 ĐÊM</p>
                                <div>
                      <span class="price">4,099,000
                        <span class="currency">₫</span>
                      </span>
                                </div>

                            </div>
                        </div>
                    </div>

                    <div class="col-md-4 clearfix d-none d-md-block">
                        <div class="card mb-2">
                            <img class="card-img-top"
                                 src="https://mdbootstrap.com/img/Photos/Horizontal/City/4-col/img%20(48).jpg" alt="">
                            <div class="card-body">
                                <h4 class="card-title">DU LỊCH MIỀN TRUNG</h4>
                                <p class="card-text">DU LỊCH PHÚ YÊN 4 NGÀY 3 ĐÊM GIÁ TIẾT KIỆM</p>
                                <div>
                      <span class="price">4,299,000
                        <span class="currency">₫</span>
                      </span>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>

            </div>
            <!--/.Second slide-->



        </div>
        <!--/.Slides-->
        <a class="carousel-control-prev" href="#multi-item-inland" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon " aria-hidden="true" style="margin-top: 0px;"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#multi-item-inland" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>

    </div>
    <!--/.Carousel Wrapper-->


</section>



<section class="reason">

    <h2 class="text-center" style="margin :50px auto;">LÝ DO CHỌN MONA TRAVEL</h2>

    <div class="row" style="width: 80%; margin: 0 auto;">
        <div class="col-md-4 ">
            <div class="achiev-card mb-2">
                <img class="achiev-icon" src="/template/images/hotel.png" alt="">
                <div class="card-body">
                    <div>
                <span style="font-weight: bold; font-size: 1.1em;">Khách sạn tốt nhất
                </span>
                    </div>
                    <p>Để mọi người mọi nhà đều có thể đi du lịch với giá cả hợp lý nhất</p>
                </div>
            </div>
        </div>
        <div class="col-md-4 ">
            <div class="achiev-card mb-2">
                <img class="achiev-icon" src="/template/images/customer-service.png" alt="">
                <div class="card-body">
                    <div>
                <span style="font-weight: bold; font-size: 1.1em;">Hỗ trợ 24/7
                </span>
                    </div>
                    <p>Để mọi người mọi nhà đều có thể đi du lịch với giá cả hợp lý nhất</p>
                </div>
            </div>
        </div>
        <div class="col-md-4 ">
            <div class="achiev-card mb-2">
                <img class="achiev-icon" src="/template/images/best-price.png" alt="">
                <div class="card-body">
                    <div>
                <span style="font-weight: bold; font-size: 1.1em;">Giá luôn tốt nhất
                </span>
                    </div>
                    <p>Để mọi người mọi nhà đều có thể đi du lịch với giá cả hợp lý nhất</p>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="achieve">
    <h5>PHỤNG SỰ KHÁCH HÀNG 8 NĂM</h5>
    <h2 class="text-center" style="margin-bottom: 30px;">THÀNH QUẢ CỦA MONA TRAVEL</h2>

    <div class="row" style="width: 80%; margin: 0 auto;">
        <div class="col-12 col-md-6 col-lg-3 ">
            <div class="achiev-card mb-2">
                <img class="achiev-icon" src="/template/images/airplane-around-earth.png" alt="">
                <div class="card-body">
                    <div>
                <span class="number">20,549+
                </span>
                    </div>
                    <p style="color: aliceblue;">Tour hoàn thành</p>
                </div>
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-3 ">
            <div class="achiev-card mb-2">
                <img class="achiev-icon" src="/template/images/guest.png" alt="">
                <div class="card-body">
                    <div>
                <span class="number">60,419+
                </span>
                    </div>
                    <p style="color: aliceblue;">Khách hàng</p>
                </div>
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-3">
            <div class="achiev-card mb-2">
                <img class="achiev-icon" src="/template/images/world.png" alt="">
                <div class="card-body">
                    <div>
                <span class="number">5,000+
                </span>
                    </div>
                    <p style="color: aliceblue;">Điểm thăm quan</p>
                </div>
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-3 ">

            <div class="achiev-card mb-2">
                <img class="achiev-icon" src="/template/images/truck.png" alt="">
                <div class="card-body">
                    <div>
                <span class="number">856+
                </span>
                    </div>
                    <p style="color: aliceblue;">Phương tiện</p>
                </div>
            </div>
        </div>

    </div>
</section>

</body>
</html>
