package util;

public class Operaciones {
    public long sumar(String a , Long b){
        long numero = Long.parseLong(a);

        return numero+b.longValue();
    }
    public long sumar(Long a , Long b){


        return a.longValue()+b.longValue();
    }
}
