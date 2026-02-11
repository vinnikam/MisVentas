package util;

public class Operaciones {
    public long sumar(String a , Long b){
        long numero = Long.parseLong(a);

        return numero+b.longValue();
    }
}
