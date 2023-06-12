<%@include file="header.jsp" %>
    <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


        <body>
            <center>
                <div class="flex-fill flex-grow-1 ms-3">

                <h1>Lista de Usuarios</h1>


                <table class="table" border cellpadding="10" cellspacing="0">
                    <thead>

                    <tr>
                        <th>Id</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Telefono</th>
                        <th>Correo</th>
                        <th>Contraseña</th>
                        <th>Estado</th>
                        <th>accion</th>
                        <th>
                        </th>
                        <br>

                    </tr>

                    <c:forEach var="Usuarios" items="${Usuarios}">

                        <tr>
                            <td>${Usuarios.getId()}</td>
                            <td>${Usuarios.getNombre_Usua()}</td>
                            <td>${Usuarios.getApellido_Usua()}</td>
                            <td>${Usuarios.getTelefono_Usua()}</td>
                            <td>${Usuarios.getCorreo_Usua()}</td>
                            <td>${Usuarios.getContraseña_Usua()}</td>
                            <c:if test="${Usuarios.getEstado_Usua() == true}">
                                <td><span class="badge bg-success active">Usuario Activo</span></td>
                            </c:if>
                            <c:if test="${Usuarios.getEstado_Usua() == false}">
                                <td><span class="badge bg-danger active">Usuario Inactivo</span></td>
                            </c:if>

                            <td>
                                <c:if test="${Usuarios.getEstado_Usua() == true}">
                                    <a rol="button" class="btn btn-danger btn-sm" onclick="">
                                        Inactivar
                                    </a>
                                </c:if>
                                <c:if test="${Usuarios.getEstado_Usua() == false}">
                                    <a rol="button" class="btn btn-success btn-sm">
                                        Activar
                                    </a>
                                </c:if>
                            </td>
                            <td class="btn">
                                <a href="Usuarios?accion=Usuario-modificar&id=${Usuarios.id}" class="btn-modificar">modificar</a>
                            </td>
                            
                            <td class="btn">
                                <a href="Usuarios?accion=eliminar&id=${Usuarios.id}" onclick="return confirm('¿Seguro de eliminar este registro?');" class="btn-eliminar">Eliminar</a>
                            </td>
                            
                        <tr>
                    </c:forEach>

                </thead>
                </table>


            </div>
            </div>
            <a type="button" class="btn btn-primary" href="Usuarios?accion=Usuario-add">
                <i class="bi bi-plus-circle"></i>
                Agregar Usuario
            </a>
        </center>


        <%@include file="footer.jsp" %>
    </body>

    </html>