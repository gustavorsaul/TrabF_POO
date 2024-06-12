import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Cores {
    private Map<String,Cor> cores;
    private static Cores instancia = null;
    
    public static Cores getInstance(){
        if (instancia == null){
            instancia = new Cores();
        }
        return instancia;
    }
    
    private Cores(){
        cores = new HashMap<>();
        cores.put("RED",new Cor("RED",Color.RED));
        cores.put("GREEN",new Cor("GREEN",Color.GREEN));
        cores.put("YELLOW",new Cor("YELLOW",Color.YELLOW));
        cores.put("BLUE",new Cor("BLUE",Color.BLUE));
        cores.put("MAGENTA",new Cor("MAGENTA",Color.MAGENTA));
        cores.put("ORANGE",new Cor("ORANGE",Color.ORANGE));
        cores.put("GRAY",new Cor("GRAY",Color.GRAY));
        cores.put("PINK",new Cor("PINK",Color.PINK));
    }

    public Cor getCor(String key){
        return cores.get(key);
    }

    public Cor proximaCor(String key){
        String[] seqCores = new String[cores.keySet().size()];
        seqCores = cores.keySet().toArray(seqCores);
        String novaCor = "";
        for(int i=0;i<seqCores.length;i++){
            if (seqCores[i].equals(key)){
                if (i<seqCores.length-1){
                    novaCor = seqCores[i+1];
                }else{
                    novaCor = seqCores[0];
                }
            }
        }
        return cores.get(novaCor);
    }
}
