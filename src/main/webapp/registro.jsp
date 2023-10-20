<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    <title>Siempre Mate</title>
</head>

<body>
<!-- Section: Design Block -->
<section class="text-center">
    <!-- Background image -->
    <div class="p-5 bg-image" style="
        background-image: url('https://mdbootstrap.com/img/new/textures/full/171.jpg');
        height: 300px;
        "></div>
    <!-- Background image -->

    <div class="card mx-4 mx-md-5 shadow-5-strong" style="
        margin-top: -100px;
        background: hsla(0, 0%, 100%, 0.8);
        backdrop-filter: blur(30px);
        ">
        <div class="card-body py-5 px-md-5">

            <div class="row d-flex justify-content-center">
                <div class="col-lg-8">
                    <h2 class="fw-bold mb-5">Unete a nosotros</h2>
                    <form method="post" action="registro">
                        <!-- 2 column grid layout with text inputs for the first and last names -->
                        <div class="row">
                            <div class="col-md-6 mb-4">
                                <div class="form-outline">
                                    <input type="text" id="form3Example1" class="form-control" name="nombre" />
                                    <label class="form-label" for="form3Example1">Nombre</label>
                                </div>
                            </div>
                            <div class="col-md-6 mb-4">
                                <div class="form-outline">
                                    <input type="text" id="form3Example2" class="form-control" name="apellido" />
                                    <label class="form-label" for="form3Example2">Apellido</label>
                                </div>
                            </div>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="text" id="form3Example5" class="form-control" name="usuario"/>
                            <label class="form-label" for="form3Example3">Usuario</label>
                        </div>


                        <!-- Email input -->
                        <div class="form-outline mb-4">
                            <input type="email" id="form3Example3" class="form-control" name="mail"/>
                            <label class="form-label" for="form3Example3">Gmail</label>
                        </div>

                        <!-- Password input -->
                        <div class="form-outline mb-4">
<%--suppress XmlDuplicatedId --%>
                            <input type="password" id="form3Example4" class="form-control" name="password" />
                            <label class="form-label" for="form3Example4">Contraseña</label>
                        </div>

                        <div class="form-outline mb-4">
<%--suppress XmlDuplicatedId --%>
                            <input type="password" id="form3Example4" class="form-control" name="password" />
                            <label class="form-label" for="form3Example4">Escribi nuevamente la contraseña</label>
                        </div>

                        <button type="submit" class="btn btn-primary btn-block mb-4">
                            Registrar
                        </button>



                    </form>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Section: Design Block -->