import clavier.In;

import java.text.DecimalFormat; //importation de la classe

public class Ihm {
    public static void main(String[] args) {
        /* Exercice 1:
        System.out.println("");
        System.out.println("Culture générale et\nexpression");
        System.out.println("");
        System.out.println("Anglais");
        System.out.println("");
        System.out.println("Maths");
        System.out.println("");
        System.out.println("Etude et\nconception de reseaux\ninformatiques ");
        System.out.println("");
        System.out.println("Exploitation et\nmaintenance des\nreseaux informatiques");
        System.out.println("");
        System.out.println("Valorisation de la\ndonnée et\ncybersecurite");
        System.out.println("");
        System.out.println("Langue vivante\nfalcutative");
         */

        // Coef
        int cultureCoef = 2;
        int anglaisCoef = 3;
        int mathsCoef = 2;
        int etudeInfoCoef = 4;
        int exploitationInfoCoef = 3;
        int cyberCoef = 7;
        int totalCoef = cultureCoef + anglaisCoef + mathsCoef + etudeInfoCoef + exploitationInfoCoef + cyberCoef;

        // NOTE


        System.out.print("Mettre votre note en Culture :  ");
        double cultureNote;
        cultureNote = In.readDouble();

        System.out.print("Mettre votre note d'Anglais :  ");
        double anglaisNote;
        anglaisNote = In.readDouble();

        System.out.print("Mettre votre note de Maths :  ");
        double mathsNote;
        mathsNote = In.readDouble();

        System.out.print("Mettre votre note d'Etude info :  ");
        double etudeInfoNote;
        etudeInfoNote = In.readDouble();

        System.out.print("Mettre votre note d'Exploitation :  ");
        double exploitationInfoNote;
        exploitationInfoNote = In.readDouble();

        System.out.print("Mettre votre note en Cyber :  ");
        double cyberNote;
        cyberNote = In.readDouble();

        //Changement nb a virgule

        double moyenneNote = ((cultureNote * cultureCoef) + (anglaisNote * anglaisCoef) + (mathsNote * mathsCoef) + (etudeInfoNote * etudeInfoCoef) + (etudeInfoNote * etudeInfoCoef) + (cyberNote * cyberCoef)) / totalCoef;
        DecimalFormat df = new DecimalFormat("#.00");

        //AFFICHAGE


        System.out.println("  ");
        System.out.println("Epreuve\t\t\t\t\t\tDuree\t\t\tCoefficient\t\t\tType d epreuve\t\t\tNote\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n\n");
        System.out.println("Culture générale\net expression \t\t\t\t4 heures \t\t\t\t" + cultureCoef + "\t\t\tEcrit\t\t\t\t\t" + cultureNote + "\n");
        System.out.println("************************************************************************************************\n\n");
        System.out.println("Anglais\t\t\t\t\t\tComprehension :\t\t\t" + anglaisCoef + "\t\t\tCCF\t\t\t\t\t\t" + anglaisNote);
        System.out.println("\t\t\t\t\t\t\t30 min sans\t\t\t\t\t\t\t2 situation\n\t\t\t\t\t\t\tpréparation\n");
        System.out.println("\t\t\t\t\t\t\tExpression :");
        System.out.println("\t\t\t\t\t\t\t15 min sans\n\t\t\t\t\t\t\tpréparation\n");
        System.out.println("************************************************************************************************\n\n");
        System.out.println("Mathématiques \t\t\t\t1 h par CCF\t\t\t\t" + mathsCoef + "\t\t\tCCF\t\t\t\t\t\t" + mathsNote);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2 situations\n\n");
        System.out.println("************************************************************************************************\n\n");
        System.out.println("Etude et\t\t\t\t\t6 heures\t\t\t\t" + etudeInfoCoef + "\t\t\tEcrit\t\t\t\t\t" + etudeInfoNote + "\nconception de\nreseaux\ninformatiques\n");
        System.out.println("************************************************************************************************\n\n");
        System.out.println("Exploitation et\t\t\t\t\t\t\t\t\t\t" + exploitationInfoCoef + "\t\t\tCF\t\t\t\t\t\t" + exploitationInfoNote + "\nmaintenance des\nreseaux\ninformatiques\n\n");
        System.out.println("************************************************************************************************\n\n");
        System.out.println("Valorisation de la\t\t\t1 heures\t\t\t\t" + cyberCoef + "\t\t\tOral\t\t\t\t\t" + cyberNote + "\ndonnée et\ncybersecurite\n\n");
        System.out.println("************************************************************************************************\n\n");
        System.out.println("Langue vivante\t\t\t\t15 minutes\t\t\tPoints au \t\tOral\t\t\t\t\t8/20\nfalcutative\t\t\t\t\t\t\t\t\t\tdessus de 10\n\n");
        System.out.println("************************************************************************************************\n\n");
        System.out.println("le nombre total de coefficients est de " + totalCoef + "\n");
        System.out.println("************************************************************************************************\n\n");
        System.out.println("t'as moyenne est de " + df.format(moyenneNote) + "\n");
        System.out.println("************************************************************************************************\n\n");

        //RESULTAT EXAMEN
        if (moyenneNote >= 16) {
            System.out.println("tu l'as eu avec mention tres bien");
        } else if (moyenneNote >= 14) {
            System.out.println("tu l'as eu avec mention bien");
        } else if (moyenneNote >= 12) {
            System.out.println("tu l'as eu avec mention assez bien");
        } else if (moyenneNote >= 10) {
            System.out.println("tu as eu ton année");
        } else {
            System.out.println("tu n'as pas eu ton année :(");
        }

        // Cas du rattrapage


        // moyenne des notes techniques

        double moyenneTechnique = (anglaisNote * anglaisCoef) + (cultureCoef * cultureNote) + (mathsNote * mathsCoef) / 7;
        if ((moyenneNote > 8) && (moyenneNote < 10) && (moyenneTechnique >= 10)) {
            System.out.println("Tu vas en rattrapage");
        }

        //choix des notes
        int cptReponse = 0;
        System.out.println("Avez vous rattraper la matiere : Anglais (y/n): ");
        char choix = In.readChar();
        if (choix == 'y') {
            System.out.println("donnez votre note: ");
            double anglaisnotenouveau;
            anglaisnotenouveau = In.readDouble();

            if (anglaisnotenouveau >= anglaisNote) {
                anglaisNote = anglaisnotenouveau;
            } else {
                System.out.println("la note est moins bonne :(");
            }
            cptReponse++;
        }

        System.out.println("Avez vous rattraper la matiere : Maths (y/n): ");
        char choix1 = In.readChar();
        if (choix1 == 'y') {
            System.out.println("donnez votre note: ");
            double mathsnotenouveau;
            mathsnotenouveau = In.readDouble();

            if (mathsnotenouveau >= mathsNote) {
                mathsNote = mathsnotenouveau;
            } else {
                System.out.println("la note est moins bonne :(");
            }
            cptReponse++;
        }

        if (cptReponse < 2) {
            System.out.println("Avez vous rattraper la matiere:Culture (y/n): ");
            char choix2 = In.readChar();
            if (choix2 == 'y') {
                System.out.println("donnez votre note: ");
                double culturenotenouveau;
                culturenotenouveau = In.readDouble();
                if (culturenotenouveau >= cultureNote) {
                    cultureNote = culturenotenouveau;
                } else {
                    System.out.println("la note est moins bonne :(");
                }
            }
        }

        //Nouvelle moyenne

        double moyenneNotenouveau ;
        moyenneNotenouveau=((cultureNote * cultureCoef) + (anglaisNote * anglaisCoef) + (mathsNote * mathsCoef) + (etudeInfoNote * etudeInfoCoef) + (etudeInfoNote * etudeInfoCoef) + (cyberNote * cyberCoef)) / totalCoef;
        System.out.println("t'as nouvelle moyenne est de "+moyenneNotenouveau);

        //RESULTAT EXAMEN
        if (moyenneNotenouveau >= 16) {
            System.out.println("tu l'as eu avec mention tres bien");
        }else if (moyenneNotenouveau >= 14){
            System.out.println("tu l'as eu avec mention bien");
        }else if (moyenneNotenouveau >= 12){
            System.out.println("tu l'as eu avec mention assez bien");
        }else if (moyenneNotenouveau >=10 ){
            System.out.println("tu as eu ton année");
        }else {
            System.out.println("tu n'as pas eu ton année :( ");
        }
        System.out.print("Hello git ");
    }
}
