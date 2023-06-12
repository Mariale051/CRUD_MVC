<%@include file="header.jsp" %>
    <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

            <body>
                <center>

                    <h1>Actualizar Usuarios</h1>

                    <form  action="Usuarios" method="post" enctype="multipart/form-data">
                        <input type="hidden" name="accion" value="${Usuarios.getId()}">
                                        
                        <div class="form-group">
                            <label>Nombre:</label>
                            <input type="text" name="Nombre_Usua" value="${Usuarios.getNombre_Usua()}" class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10" data-validacion-tipo="requerido|min:8">
                        </div>
                                            
                        <div class="form-group">
                            <label class="apellido">Apellido:</label>
                            <input type="text" name="apellido_Usua" value="${Usuarios.getApellido_Usua()}" class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10" data-validacion-tipo="required">
                        </div>
                                            
                        <div class="form-group">
                            <label class="Telefono">Teléfono:</label>
                            <input type="text" name="Telefono_Usua" value="${Usuarios.getTelefono_Usua()}" class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10" data-validacion-tipo="requerido|min:3">
                        </div>
                                        
                        <div class="form-group">
                            <label class="correo">Correo:</label>
                            <input type="email" name="Correo_Usua" value="${Usuarios.getCorreo_Usua()}" class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10" data-validacion-tipo="requerido|min:3">
                        </div>
                        
                        <div class="form-group">
                            <label class="contraseña">Contraseña:</label>
                            <input type="password" name="password_U" value="${Usuarios.getContraseña_Usua()}" class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10" data-validacion-tipo="requerido|min:3">
                        </div>
                        
                        <div class="text-right">
                            <button type="submit" class="btn-guardar">Guardar</button>
                        </div>
                         </form>

                </center>

                <%@include file="footer.jsp" %>

            </body>

            </html>