<!doctype html>
<html lang="en">
<nav class="navbar navbar-dark bg-white">
    <form class="form-inline">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-dark my-2 my-sm-0" type="submit">Search</button>
    </form>
    <div class="mx-auto" style="width: 50px;">
        <a class="navbar-brand" href="#">
            <img src="img/Siempre_Mate__1_-removebg-preview (1).png" width="100" height="100" alt="">
        </a>
    </div>
    <span class="border border-white">

                <% if (session.getAttribute("usuario")!=null){%>
                    <button type="button" class="btn btn-outline-dark"><a href="logout"> Cerrar Sesion </a></button>
                <%}else{%>
                    <button type="button" class="btn btn-outline-dark"><a href="registro.jsp">Crear Cuenta</a></button>

                    <button type="button" class="btn btn-outline-dark"> <a href="login.jsp">Acceder</a></button>
                <%}%>
    </span>

</nav>




<nav class="navbar navbar-dark bg-dark">

    <nav class="navbar navbar-expand-lg navbar-light bg-dark">
        <div class=" text navbar-light" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Inicio <span class="sr-only">(current)</span></a>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
                        Productos
                    </a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">SET MATEROS</a>
                        <a class="dropdown-item" href="#">MATES</a>
                        <a class="dropdown-item" href="#">BOMBILLAS</a>
                        <a class="dropdown-item" href="#">TERMOS</a>
                        <a class="dropdown-item" href="#">YERBAS</a>
                        <a class="dropdown-item" href="#">MATERAS</a>
                        <a class="dropdown-item" href="#">MOCHILA</a>
                        <a class="dropdown-item" href="#">YERBERAS</a>
                        <a class="dropdown-item" href="#">ACCESORIOS</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Personalizado</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">SiempreMatesTips</a>
                </li>
                <div class="d-flex justify-content-center"><button type="button" class="btn btn-outline-light my-2 my-sm-0">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cart-fill" viewBox="0 0 16 16">
                        <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .491.592l-1.5 8A.5.5 0 0 1 13 12H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
                    </svg>
                </button>

                </div>


        </ul>
        </div>
    </nav>
</nav>