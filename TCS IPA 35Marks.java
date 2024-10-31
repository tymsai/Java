import java.util.*;

class Main {
    public static void main(String[] args) {
        // Simulated input
        String simulatedInput = "aaa\nArka\nAction\n250000000\n" +
                                "bbbb\nGeethaArts\nComedy\n25000000\n" +
                                "ccc\nMarvel\nArt\n2000000\n" +
                                "ddd\nMythri\nAction\n300000000\n" +
                                "Action\n";
                                
        System.setIn(new java.io.ByteArrayInputStream(simulatedInput.getBytes()));
        
        Scanner sc = new Scanner(System.in);
        Movie[] arr = new Movie[4];
        
        // Reading movies details from simulated input
        for (int i = 0; i < arr.length; i++) {
            String name = sc.nextLine();
            String comp = sc.nextLine();
            String gen = sc.nextLine();
            int budget = sc.nextInt(); sc.nextLine();
            
            arr[i] = new Movie(budget, gen, comp, name);
        }
        
        // Reading genre to search for
        String gen = sc.nextLine();
        
        // Getting movies by genre
        ArrayList<String> am = getMovieByGenre(gen, arr);
        for (String movieCategory : am) {
            System.out.println(movieCategory);
        }
        
        sc.close();
    }
    
    public static ArrayList<String> getMovieByGenre(String gen, Movie[] arr) {
        ArrayList<String> am = new ArrayList<>();
        for (Movie movie : arr) {
            if (gen.equalsIgnoreCase(movie.getGen())) {
                if (movie.getBudget() > 80000000) {
                    am.add("High Budget Movie");
                } else {
                    am.add("Low Budget Movie");
                }
            }
        }
        return am;
    }
}

class Movie {
    private int budget;
    private String gen;
    private String comp;
    private String name;

    public Movie(int budget, String gen, String comp, String name) {
        this.budget = budget;
        this.name = name;
        this.gen = gen;
        this.comp = comp;
    }

    public int getBudget() {
        return budget;
    }

    public String getComp() {
        return comp;
    }

    public String getGen() {
        return gen;
    }

    public String getName() {
        return name;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }
}
