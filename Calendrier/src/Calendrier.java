import java.util.Scanner;

public class Calendrier {
    public String[] ListeDesSaints = {
            // Janvier
            "Marie", "Basile, Grégoire", "Geneviève", "Odilon", "Édouard", "Mélaine", "Raymond", "Lucien", "Alix", "Guillaume", "Paulin", "Tatiana", "Yvette", "Nina", "Rémi", "Marcel", "Roseline", "Prisca", "Marius", "Sébastien", "Agnès", "Vincent", "Barnard", "François", "Ananie", "Paule", "Angèle", "Thomas", "Gildas", "Martine", "Marcelle",

            // Février
            "Ella", "Théophane", "Blaise", "Véronique", "Agathe", "Gaston", "Eugénie", "Jacqueline", "Apolline", "Arnaud", "Héloïse", "Félix", "Béatrice", "Valentin", "Claude", "Julienne", "Alexis", "Bernadette", "Gabin", "Aimée", "Pierre-Damien", "Isabelle", "Lazare", "Modeste", "Roméo", "Nestor", "Honorine", "Romain",
            "Auguste", // 29 février

            // Mars
            "Aubin", "Charles", "Guénolé", "Casimir", "Olive", "Colette", "Félicité", "Jean", "Françoise", "Vivien", "Rosine", "Justine", "Rodrigue", "Mathilde", "Louise", "Bénédicte", "Patrice", "Cyrille", "Joseph", "Herbert", "Clémence", "Léa", "Victorien", "Catherine", "Humbert", "Larissa", "Habib", "Gontran", "Gwladys", "Amédée", "Benjamin",

            //  Avril
            "Hugues", "Sandrine, Alexandrine", "Richard", "Isidore", "Irène", "Marcellin", "Jean-Baptiste", "Julie", "Gauthier", "Fulbert", "Stanislas", "Jules", "Ida10", "Maxime", "Paterne", "Benoît-Joseph", "Anicet", "Parfait", "Emma", "Odette", "Anselme", "Alexandre", "Georges", "Fidèle", "Marc", "Alida", "Zita", "Valérie", "Catherine", "Robert",

            // Mai
            "Jérémie", "Boris", "Philippe, Jacques", "Sylvain", "Judith", "Prudence", "Gisèle", "Désiré", "Pacôme", "Solange", "Estelle", "Achille", "Rolande", "Matthias", "Denise", "Honoré", "Pascal", "Éric", "Yves", "Bernardin", "Constantin", "Émile", "Didier", "Donatien", "Sophie", "Bérenger", "Augustin", "Germain", "Aymard", "Ferdinand", "Perrine",

            // Juin
            "Justin", "Blandine", "Kévin", "Clotilde", "Igor", "Norbert", "Gilbert", "Médard", "Diane", "Landry", "Barnabé", "Guy", "Antoine", "Élisée", "Germaine", "Jean-François", "Hervé", "Léonce", "Romuald", "Silvère", "Rodolphe", "Alban", "Audrey", "Jean-Baptiste", "Prosper", "Anthelme", "Fernand", "Irénée", "Pierre/Paul", "Martial",

            // Juillet
            "Thierry", "Martinien", "Thomas", "Florent", "Antoine", "Mariette", "Raoul", "Thibaut", "Amandine", "Ulrich15", "Benoît", "Olivier", "Henri/Joël", "Camille", "Donald", "Carmen", "Charlotte", "Frédéric", "Arsène", "Marina", "Victor", "Marie-Madeleine", "Brigitte", "Christine", "Jacques", "Anne/Joachim", "Nathalie", "Samson", "Marthe", "Juliette", "Ignace",

            // Août
            "Alphonse", "Julien", "Lydie", "Jean-Marie", "Abel", "Octavien", "Gaétan", "Dominique", "Amour", "Laurent", "Claire", "Clarisse, Jeanne", "Hippolyte", "Évrard", "Marie, Assomption", "Armel", "Hyacinthe", "Hélène", "Jean-Eudes", "Bernard", "Christophe", "Fabrice", "Rose", "Barthélémy", "Louis", "Natacha et Adrien", "Monique", "Augustin", "Sabine", "Fiacre", "Aristide",

            // Septembre
            "Gilles", "Ingrid", "Grégoire", "Rosalie", "Raïssa", "Bertrand", "Reine", "Adrien", "Alain", "Inès", "Adelphe", "Apollinaire", "Aimé", "Cyprien", "Roland", "Édith", "Renaud", "Nadège", "Émilie", "Davy", "Matthieu", "Maurice", "Constant", "Thècle", "Hermann", "Côme et Damien", "Vincent", "Venceslas", "Michel", "Jérôme",

            // Octobre
            "Thérèse", "Léger", "Gérard", "François", "Fleur", "Bruno", "Serge", "Pélagie", "Denis", "Ghislain", "Firmin", "Wilfried", "Géraud", "Juste", "Aurélie", "Edwige", "Baudouin", "Luc", "René", "Adeline", "Céline", "Élodie", "Jean", "Florentin", "Crépin", "Dimitri", "Emeline", "Simon et Jude", "Narcisse", "Bienvenue", "Quentin",

            // Novembre
            "Harold", "Océane", "Hubert", "Charles", "Sylvie", "Bertille", "Carine", "Geoffroy", "Théodore", "Léon", "Martin", "Christian", "Brice", "Sidoine", "Albert", "Marguerite", "Élisabeth", "Aude", "Tanguy", "Edmond", "Rufus, Marie", "Cécile", "Clément", "Flora", "Catherine", "Delphine", "Séverin, Marie", "Jacques", "Saturnin", "André",

            // Décembre
            "Florence", "Viviane", "Xavier", "Barbara", "Gérald", "Nicolas", "Ambroise", "Elfried", "Pierre", "Romaric", "Daniel", "Corentin", "Lucie", "Odile", "Ninon", "Alice", "Gaël", "Gatien", "Urbain", "Théophile, Ignace", "Pierre", "Françoise-Xavière", "Armand", "Adèle", "Emmanuel", "Étienne", "Jean", "Gaspard", "David", "Roger", "Sylvestre"
    };

    void genererEnteteHTML() {
        System.out.print("""
                <!DOCTYPE html>
                <html lang="fr">
                <head>
                  <meta charset="UTF-8">
                  <meta name="viewport" content="width=device-width, initial-scale=1.0">
                  <title>Calendrier</title>
                  <style>
                    body h1 {
                        text-align: right;
                    }
                    /* Conteneur principal */
                    .calendar {
                      display: grid;
                      grid-template-columns: repeat(6, 1fr); /* 6 mois par ligne */
                      gap: 20px;
                      padding: 20px;
                    }
                
                    /* Conteneur pour chaque mois */
                    .month {
                      border: 2px solid #ddd;
                      padding: 10px;
                      background-color: #f9f9f9;
                    }
                
                    /* Titre du mois */
                    .month-title {
                      font-size: 1.5em;
                      color: #3A67D3; /* Couleur du titre */
                      text-align: center;
                      margin: 0 0 10px 0;
                    }
                    
                    .event {
                      font-size: 0.6em
                    }
                
                    /* Conteneur pour les jours */
                    .days {
                      display: grid;
                      grid-template-columns: repeat(1, 1fr); /* Chaque jour en ligne */
                      gap: 5px;
                    }
                
                    /* Style pour chaque jour */
                    .day {
                      display: flex;
                      align-items: center;
                      justify-content: space-between;
                      padding: 5px;
                      background-color: #E6F0FF; /* Couleur de fond des jours */
                      border-left: 4px solid transparent; /* Bande de couleur */
                    }
                
                    /* Style du numéro de jour */
                    .day-number {
                      font-weight: bold;
                    }
                
                    /* Style du nom de jour et événement */
                    .day-name, .event {
                        font-size: 0.6em;
                    }
                    .day-name {
                        font-size: 0.9em;
                    }
                    .week-number {
                      margin-left: auto;
                    }
                  </style>
                </head>""");
    }; // affiche l entete dans le terminal

    static String[] listeMois = new String[] {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
    static String[] listeJoursDeLaSemaine = {"SAM", "DIM", "LUN", "MAR", "MER", "JEU", "VEN"};
    int jourActuel = 0;

    String genererLigne(int j, int m, int a) {
        String jour = listeJoursDeLaSemaine[jourDeLaSemaine(j, m, a)];

        String event = ListeDesSaints[jourActuel]; // cherche dans le tableau la saint a partir du num du jour
        if (!estBisextile(a) && m == 2 && j == 28) { // si annee n'est pas bisextile on skip le prochain jour (29)
            jourActuel ++;
        }
        jourActuel ++;

        String html = "<div class='day'><span class='day-name'>" +
                jour +
                "</span>&nbsp;<span class='day-number'>" +
                j +
                "</span>&nbsp;<span class='event'>" +
                "St " + event +
                "</span><span class='week-number'>" +
                numeroDeLaSemaine(j, m, a) +
                "</span></div>";

        return html;
    }

    void genererCalendrier(int a) {
        String html = "<body><h1>Calendrier " + a + "</h1><div class='calendar'>";
        for(int m = 1; m <= 12; m++) { // genere tous les mois
            html += "<div class='month'><h3 class='month-title'>" + listeMois[m-1] + "</h3><div class='days'>";
            for (int j = 1; j <= nbrJourMois(m, a); j++) { // genere tous les jours dans les mois
                html += genererLigne(j, m, a);
            }
            html += "</div></div>";
        }
        html += "</div></body>";
        System.out.println(html);
    }

    int jourDeLaSemaine(int day, int month, int year) {
        // Algorithme de Zeller pour récupérer le jour de la semaine
        // Le calendrier grégorien considère janvier et février comme des mois du "précédent" année, c'est-à-dire comme étant le mois 13 et 14 de l'année précédente. Par exemple, janvier 2024 devient le mois 13 de l'année 2023
        // Cela permet de calculer les jours de la semaine en utilisant les mêmes règles pour tous les mois
        if (month < 3) {
            month += 12;
            year--;
        }

        int k = year % 100; // Deux premiers chiffres de n'année
        int j = year / 100; // Deux Derniers chiffres de l'année
        // Cela permet d'appliquer le calcul pour les dates en fonction du "siècle" (les deux premiers chiffres de l'année).

        //La formule est une combinaison de plusieurs calculs mathématiques qui tiennent compte du jour, du mois et de l'année, en ajustant pour les différences dans le nombre de jours entre les mois.
        int h = (day + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        return h;
    }

    boolean estBisextile(int a) {
        if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){ // vérifie si l'année en entrée est bissextile ou non
            return true; // L'année est bissextile
        }
        return false;
    }

    public int numeroDeLaSemaine(int jour, int mois, int annee) {

        int jourDeLAnnee = jour; // compteur initialiser avec jour
        for (int m = 1; m < mois; m++) { // parcour les mois jusqu a celui entrer en param
            jourDeLAnnee += nbrJourMois(m, annee); // on ajoute les jours
        }

        int jourDeSemaine1erJanvier = jourDeLaSemaine(1, 1, annee); // jour de la semaine commence 01/01

        int decalage = (jourDeSemaine1erJanvier <= 3) ? 1 : 0; // Calcul du decalage
        int numeroSemaine = (jourDeLAnnee - decalage) / 7 + 1; // Calcul le num de la semaine

        return numeroSemaine; // Retourne le numero de la semaine
    }

    public int nbrJourMois(int mois, int annee) {
        if (mois == 2) { // si c'est fevrier
            if (estBisextile(annee)) { // et bissextile
                return 29;
            }
            return 28;
        }
        if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) { // les mois qui comportent 31j
            return 31;
        }
        return 30; // 30 jours
    }


    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.err.println("Entrez l'année");
        int annee = in.nextInt();
        new Calendrier().genererEnteteHTML();
        new Calendrier().genererCalendrier(annee);
    }
}