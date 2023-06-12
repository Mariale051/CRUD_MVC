<%@include file="header.jsp" %>
    <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


            <body>
                <center>
                    <div class="flex-fill flex-grow-1 ms-3">

                        <h1>Lista de Bolsillos</h1>


                        <table class="table" border cellpadding="10" cellspacing="0">
                            <thead>

                                <tr>
                                    <th>Id</th>
                                    <th>Nombre</th>
                                    <th>Estado</th>
                                    <th>accion</th>
                                    <th>
                                    </th>
                                    <br>

                                </tr>

                                <c:forEach var="BolsilloDigital" items="${BolsilloDigital}">

                                    <tr>
                                        <td>${BolsilloDigital.getId_BolsilloDigital()}</td>
                                        <td>${BolsilloDigital.getNombre_Bolsillo()}</td>
                                        <c:if test="${BolsilloDigital.getEstado_Bolsillo() == true}">
                                            <td><span class="badge bg-success active">Bolsillo Activo</span></td>
                                        </c:if>
                                        <c:if test="${BolsilloDigital.getEstado_Bolsillo() == false}">
                                            <td><span class="badge bg-danger active">Bolsillo Inactivo</span></td>
                                        </c:if>

                                        <td>
                                            <c:if test="${BolsilloDigital.getEstado_Bolsillo() == true}">
                                                <a rol="button" class="btn btn-danger btn-sm" onclick="">
                                                    Inactivar
                                                </a>
                                            </c:if>
                                            <c:if test="${Usuarios.getEstado_Bolsillo() == false}">
                                                <a rol="button" class="btn btn-success btn-sm">
                                                    Activar
                                                </a>
                                            </c:if>
                                        </td>
                                        <td class="btn">
                                            <a href="BolsilloDigital?accion=Usuario-modificar&id=${BolsilloDigital.id}"
                                                class="btn-modificar">modificar</a>
                                        </td>

                                        <td class="btn">
                                            <a href="BolsilloDigital?accion=eliminar&id=${BolsilloDigital.id}"
                                                onclick="return confirm('¿Seguro de eliminar este registro?');"
                                                class="btn-eliminar">Eliminar</a>
                                        </td>

                                    <tr>
                                </c:forEach>

                            </thead>
                        </table>


                    </div>
                    </div>
                    <a type="button" class="btn btn-primary" href="BolsilloDigital?accion=BolsilloDigital-add">
                        <i class="bi bi-plus-circle"></i>
                        Agregar Bolsillo Digital
                    </a>
                </center>


                <%@include file="footer.jsp" %>
            </body>

            </html>