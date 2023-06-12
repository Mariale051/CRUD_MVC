<!DOCTYPE html>
<html lang="es">
<head>
    <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" href= "assets/css/index.css">
    <title>Bolsillo digital</title>
</head> 
<body>
<nav class="navbar navbar-expand-md bg-light" id="nav">
<div class="container-fluid">
    <button class="navbar-toggler" id="collapse-btn" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-menu">Menú</span>
    </button>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
            <a class="nav-link nav nav-title disabled" href="usuario?petition=index">Billetera digital</a>
        <ul class="navbar-nav d-flex justify-content-center align items-center">
            <li class="nav-item ">
            <a class="nav-link active" href="usuario?petition=index" >Inicio</a>
            </li>
            <li class="nav-item ">
                <a class="nav-link active" href="usuario?petition=listar_usu_davip">Ver/editar usuarios</a>
                </li>
        </ul>
    </div>
</div>
</nav>
<div class="container container-cards">
            <div class="row">
                <div class="col-lg card-col">
                    <div class="card align-items-center justify-content-center align-items-center">
                        <h5 class="card-title" >Consulta tu saldo</h5>
                        <div class="card-body">
                        <p class="card-text">Dando clic en el botón de abajo podrás consultar cuánto dinero tienes en tu bolsillo ahora mismo.</p>
                        <div class="row">
                    <!-- VENTANA MODAL CONSULTA SALDO -->
                            <button type="button" class="btn card-btn " data-bs-toggle="modal" data-bs-target="#exampleModal" >
                                Consultar
                            </button>
                            
                            <!-- Modal -->
                            <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Consulta dinero</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                    <p>Consulta tu saldo</p>
                                    </div>
                                    <div class="modal-footer">
                                <form action="route" method="POST">
                                    <input type="text" style="color:#000000;" hidden name="consulta"/>
                                    <button type="submit" name="accion" value="consulta_davip" class="btn btn-secondary" data-bs-dismiss="modal">Aceptar</button>
                                </form>
                                    </div>
                                </div>
                                </div>
                            </div>
                        <!-- VENTANA MODAL CONSULTA SALDO -->        
                    </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg card-col">
                    <div class="card align-items-center justify-content-center align-items-center">
                        <h5 class="card-title" >Retira dinero</h5>
                        <div class="card-body">
                        <p class="card-text">Retira dinero de tu bolsillo, podrás recibir el dinero en cualquiera de nuestos puntos físicos</p>
                        <div class="row">
                        <!-- VENTANA MODAL RETIRO SALDO -->
                            <button type="button" class="btn card-btn" data-bs-toggle="modal" data-bs-target="#exampleModal-2">
                                Retira
                            </button>
                            
                            <!-- Modal -->
                            <div class="modal fade" id="exampleModal-2" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Retira dinero</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <form action="route" method="POST">
                                            <p>Ingresa la cantidad que deseas retirar aquí.</p>
                                            <input type="number" name="retiro" style="color:#000000;"/>
                                        
                                        
                                    </div>
                                    <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                    <div class="row">
                                        <button type="submit" name="accion" value="retiro_davip">Aceptar</button>
                                    </form>
                                    </div>
                                    </div>
                                </div>
                                </div>
                            </div>
                        <!-- VENTANA MODAL RETIRO SALDO -->        
                    </div>
                </div>
            </div>
        </div>
        <div class="container container-cards">
            <div class="row">
                <div class="col-lg card-col">
                    <div class="card align-items-center justify-content-center align-items-center" style="margin-top: 2%;">
                        <h5 class="card-title" >Recarga tu bolsillo</h5>
                        <div class="card-body">
                        <p class="card-text">Acá puedes meterle plata a tu bolsillo desde otros bancos, sus apps y medios, o por medios de pago en línea, tales como pse, claro pay, rappi pay entre otros</p>
                        <div class="row">
                            <!-- VENTANA MODAL RETIRO SALDO -->
                                <button type="button" class="btn card-btn" data-bs-toggle="modal" data-bs-target="#exampleModal-3">
                                    Recarga
                                </button>
                                <!-- Modal -->
                                <div class="modal fade" id="exampleModal-3" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Recarga bolsillo</h5>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                        </div>
                                    <div class="modal-body">
                                <form action="route" method="POST">
                                        <p>Ingresa la cantidad que deseas recargar aquí.</p>
                                            <input type="number" name="saldo" style="color:#000000;"/>   
                                        </div>
                                        <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                                        <div class="row">
                                            <button type="submit" name="accion" value="recarga_davip">Aceptar</button>
                                            </form>
                                        </div>
                                        </div>
                                    </div>
                                    </div>
                                </div>
                            <!-- VENTANA MODAL RETIRO SALDO -->        
                        </div>
                    </div>
                </div>
        </div>
    </div>
</div>
</body>
</html>