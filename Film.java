package TEST;

import java.util.Vector;

class Film{
    String name;
    String language;
    String lead_actor;
    String category;
    int duration;

    Film(){
        name = null;
        language = null;
        lead_actor = null;
        category = null;
        duration = 0;
    }

    Film(String n, String lang, String actor, String cat, int dur){
        name = n;
        language = lang;
        lead_actor = actor;
        category = cat;
        duration = dur;
    }



    public static void main(String[] args) {

        Film films;
        Vector<Film> Films = new Vector<Film>();

        films = new Film();
        films.name = "Terminator";
        films.language = "English";
        films.lead_actor = "Arnold";
        films.duration = 10;
        films.category = "Action";
        Films.add(films);

        films = new Film();
        films.name = "Terminator 2";
        films.language = "English";
        films.lead_actor = "Arnold";
        films.duration = 20;
        films.category = "Action";
        Films.add(films);

        films = new Film();
        films.name = "Robot 1";
        films.language = "Tamil";
        films.lead_actor = "Rajini";
        films.duration = 10;
        films.category = "Comedy";
        Films.add(films);

        films = new Film();
        films.name = "Robot 2";
        films.language = "Tamil";
        films.lead_actor = "Rajini";
        films.duration = 30;
        films.category = "Comedy";
        Films.add(films);

        int min = 9999999;
        int imin = 0;

        for(int i = 0; i < 4; i++){
            films = Films.get(i);
            if(films.lead_actor.equals("Arnold"))
                if(films.duration < min){
                    min = films.duration;
                    imin = i;
                }
            if(films.category.equals("Comedy"))
                System.out.println(films.name + " is a Comedy movie");
            if(films.lead_actor.equals("Rajini"))
            	System.out.println(films.name+" with lead_actor as Rajini");
        }

        films = Films.get(imin);
        System.out.println("Shortest Arnold film is " + films.name + " and duration: " + min);
    }
}
