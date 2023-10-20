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
    <div class="" style="
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
                    <form method="post" action="logines">
                        <!-- Email input -->
                        <div class="form-outline mb-4">
                            <%--@declare id="form3example3"--%><input type="email" name="usuario" class="form-control" />
                            <label class="form-label" for="form3Example3">Gmail</label>
                        </div>

                        <!-- Password input -->
                        <div class="form-outline mb-4">
                            <%--@declare id="form3example4"--%><input type="password" name="password" class="form-control" />
                            <label class="form-label" for="form3Example4">Contraseña</label>
                        </div>

                        <% if (session.getAttribute("usuario")!=null){%>
                        <button type="button" class="btn btn-outline-dark"><a href="logout"> Cerrar Sesion </a></button>
                        <%}else{%>
                        <button type="button" class="btn btn-outline-dark"><a href="registro.jsp">Crear Cuenta</a></button>

                        <button type="button" class="btn btn-outline-dark"> <a href="login.jsp">Acceder</a></button>
                        <%}%>


                        <button type="submit" class="btn btn-primary btn-block mb-4">
                            Iniciar sesión
                        </button>
                    </form>


                 </div>
            </div>
        </div>
    </div>
</section>
<!-- Section: Design Block -->