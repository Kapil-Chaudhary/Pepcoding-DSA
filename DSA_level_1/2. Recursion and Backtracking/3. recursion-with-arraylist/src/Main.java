import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if ( sr==dr && sc==dc ){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> path = new ArrayList<>();

        // horizontal moves
        for (int ms=1; ms<=dc-sc; ms++ ) {
            ArrayList<String> hpath = getMazePaths(sr, sc+ms, dr, dc);
            for ( String val : hpath ) path.add("h" + ms + val);
        }

        // vertical moves
        for ( int ms=1; ms<=dr-sr; ms++ ) {
            ArrayList<String> vpath = getMazePaths(sr+ms, sc, dr, dc);
            for ( String val : vpath ) path.add("v" + ms + val);
        }

        for ( int ms=1; (ms<=dr-sr && ms<=dc-sc); ms++ ) {
            ArrayList<String> dpath = getMazePaths(sr+ms, sc+ms, dr, dc);
            for ( String val : dpath ) path.add("d" + ms + val);
        }

        return path;
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int dr = scan.nextInt();
        int dc = scan.nextInt();

        List<String> ans = getMazePaths(1, 1, dr, dc);
        System.out.println(ans);

    }

}