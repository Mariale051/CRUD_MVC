<%@include file="header.jsp" %>
    <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



            <body>
                <center>
                    <form action="BolsilloDigital" method="post">
                        <table class="table" border cellpadding="10" cellspacing="0">
                            <div class="form-group">
                                <label for="nombre_Bolsillo">Nombre</label>
                                <input type="text" name="Nombre_Usua" id="nombre_Bolsillo" 
                                class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10" >
                            </div>
                            <div class="form-check">
                                <input type="checkbox" name="estado_Bolsillo" id="estado_Bolsillo" checked
                                class="u-border-3 u-border-palette-1-dark-2 u-input u-input-rectangle u-radius-10">
                                <label for="chkestado"> Activo</label>
                            </div>

                            <div>
                                <button type="submit" class="btn btn-primary" name="accion"
                                    href="BolsilloDigital?accion=listar" value="add">Guardar</button>
                            </div>
                    </form>
                    </table>
                </center>

                <%@include file="footer.jsp" %>
            </body>

            </html>