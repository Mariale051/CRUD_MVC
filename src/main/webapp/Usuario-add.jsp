<%@include file="header.jsp" %>
    <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



            <body>
                <center>
                    <form action="Usuarios" method="post">
                        <table class="table" border cellpadding="10" cellspacing="0">
                            <div class="form-group">
                                <label for="Nombre_Usua">Nombre</label>
                                <input type="text" name="Nombre_Usua" id="Nombre_Usua" 
                                class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10" >
                            </div>
                            <div class="form-group">
                                <label for="Apellido_Usua">Apellido</label>
                                <input type="text" name="apellido_Usua" id="Apellido_Usua" 
                                class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10" >
                            </div>
                            <div class="form-group">
                                <label for="Telefono_Usua">Telefono</label>
                                <input type="number" name="Telefono_Usua" id="Telefono_Usua"
                                class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10">
                            </div>
                            <div class="form-group">
                                <label for="Correo_Usua">Correo</label>
                                <input type="email" name="Correo_Usua" id="Correo_Usua"
                                class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10">
                            </div>
                            <div class="form-group">
                                <label for="password_u">Contraseña</label>
                                <input type="password" name="password_u" id="password_u"
                                class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10">
                            </div>

                            <div class="form-check">
                                <input type="checkbox" name="Estado_Usua" id="Estado_Usua" checked
                                class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10">
                                <label for="chkestado"> Activo</label>
                            </div>

                            <div>
                                <button type="submit" class="btn btn-primary" name="accion"
                                    href="Usuarios?accion=listar" value="add">Guardar</button>
                            </div>
                    </form>
                    </table>
                </center>

                <%@include file="footer.jsp" %>
            </body>

            </html>