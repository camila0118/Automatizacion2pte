
package co.com.sena.models;

public class RegitrationData {


    private String ident;
    private String correo;
    private String password2;

    public RegitrationData(String ident, String correo, String password2) {
        this.ident = ident;
        this.correo = correo;
        this.password2 = password2;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

}
