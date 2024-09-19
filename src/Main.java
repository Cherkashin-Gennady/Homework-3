public class Main {
    public static void main(String[] args) {
        System.out.println("задача 1");
        int a=12732;
        System.out.println("Значение переменной a с типом int равно "+a);
        byte y=-121;
        System.out.println("Значение переменной y с типом byte равно "+y);
        short cat =32000;
        System.out.println("Значение переменной cat с типом short равно "+cat);
        long bol=-5768868L;
        System.out.println("Значение переменной bol с типом long равно "+bol);
        float b=3.277f;
        System.out.println("Значение переменной b с типом float равно "+b);
        double w=25.9884;
        System.out.println("Значение переменной w с типом double равно "+w);
        System.out.println("задача 2");
        float d=27.12f;
        System.out.println("Значению "+d+ " сответствует переменная d с типом float.");
        long n=987678965549L;
        System.out.println("Значению "+n+ " сответствует переменная n с типом long.");
        float l=2.786f;
        System.out.println("Значению "+l+ " сответствует переменная l с типом float.");
        short t =569;
        System.out.println("Значению "+t+ " сответствует переменная t с типом short.");
        int h=-159;
        System.out.println("Значению "+h+ " сответствует переменная h с типом int.");
        short s=27897;
        System.out.println("Значению "+s+ " сответствует переменная s с типом short.");
        byte z=67;
        System.out.println("Значению "+z+ " сответствует переменная z с типом byte.");
        System.out.println("задача 3");
        byte studentsLyud=23;
        byte studentsAn =27;
        byte studentsEkat =30;
        int sheetsPaper=480;
        System.out.println("На каждого ученика рассчитано " +
                "по "+sheetsPaper/(studentsLyud+studentsAn+studentsEkat)+" листов бумаги.");
        System.out.println("задача 4");
        byte producedIn2minutes=16;
        System.out.println("За 20 минут машина " +
                "произвела "+ producedIn2minutes*10+" штук бутылок,");
        System.out.println("в сутки машина " +
                "произвела "+ producedIn2minutes*30*24+" штук бутылок,");
        System.out.println("за 3 дня машина " +
                "произвела "+ producedIn2minutes*30*24*3+" штук бутылок,");
        System.out.println("за 1 месяц машина " +
                "произвела "+ producedIn2minutes*30*24*31+" штук бутылок.");
        System.out.println("задача 5");
        byte v=120;
        byte white=2;
        byte brown=4;
        System.out.println("В школе, где "+v/(white+brown)+" классов, " +
                "нужно "+v/(white+brown)*white+" банок белой " +
                "краски и "+v/(white+brown)*brown+" банок коричневой краски");
        System.out.println("задача 6");
        byte piecesBananas =5;
        byte weightBanana =80;
        int totalWeight=piecesBananas*weightBanana;
        short piecesMilk =200;
        int pieces100=piecesMilk/100;
        short weightMilk100 =105;
        int totalMilk=weightMilk100*pieces100;
        byte creamBriquettes=2;
        short weightBriquettes=100;
        int totalBriquettes=creamBriquettes*weightBriquettes;
        byte eggs=4;
        short weightEggs=70;
        int totalEggs=eggs*weightEggs;
        int sumTotal=totalWeight+totalMilk+totalBriquettes+totalEggs;
        System.out.println("Вес спортзавтрака равен "+sumTotal+ " в граммах, " +
                "или "+sumTotal/1000f+" в килограммах.");
        System.out.println("задача 7");
        short gramPurpose=7000;
        short minGram1=250;
        short maxGram1=500;
        int maxDays=gramPurpose/minGram1;
        int minDays=gramPurpose/maxGram1;
        int srGram1= (minGram1+maxGram1)/2;
        int srDays=gramPurpose/srGram1;
        System.out.println("Если спортсмен будет терять каждый день по " +
                "250 грамм, то "+gramPurpose/1000+ " кг. " + "он сбросит " +
                "за "+maxDays+ " дней;");
        System.out.println("Если спортсмен будет терять каждый день по " +
                "500 грамм, то "+gramPurpose/1000+ " кг. " + "он сбросит " +
                "за "+minDays+ " дней;");
        System.out.println("Если спортсмен будет терять каждый день в среднем " +
                "от 250 до 500 грамм, то "+gramPurpose/1000+ " кг. " + "он сбросит " +
                "за "+srDays+ " дней;");
        System.out.println("задача 8");
        int monthMasha= 67760;
        int annualM=monthMasha*12;
        float annualMpr=annualM*1.1f;
        int heightM=(int) annualMpr-annualM;
        int monthDenis= 83690;
        int annualD=monthDenis*12;
        float annualDpr=annualD*1.1f;
        int heightD=(int) annualDpr-annualD;
        int monthKristina= 76230;
        int annualK=monthKristina*12;
        float annualKpr=annualK*1.1f;
        int heightK=(int) annualKpr-annualK;
        System.out.println("Маша теперь получает "+monthMasha*1.1f+" " +
                "рублей в месяц. Годовой доход вырос на "+heightM+" рублей.");
        System.out.println("Денис теперь получает "+monthDenis*1.1f+" " +
                "рублей в месяц. Годовой доход вырос на "+heightD+" рублей.");
        System.out.println("Кристина теперь получает "+monthKristina*1.1f+" " +
                "рублей в месяц. Годовой доход вырос на "+heightK+" рублей.");
    }
}