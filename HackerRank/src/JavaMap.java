import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class JavaMap {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> mapTelefones = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            mapTelefones.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(mapTelefones.containsKey(s)) {
                System.out.println(s + "=" + mapTelefones.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
