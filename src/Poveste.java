public class Poveste {
    public static void main (String[]args){
        Biserica bisericaSfIosif = new Biserica();
        bisericaSfIosif.nume = "Catedrala Romano Catolica Sf Iosif";
        bisericaSfIosif.capacitate =100;
        bisericaSfIosif.latitudine =22.0;
        bisericaSfIosif.longitudine =12.0;
        bisericaSfIosif.tipReligie ="ortodoxa";
        bisericaSfIosif.program = "8-22";
        bisericaSfIosif.buget = 100000;
        bisericaSfIosif.rating = 4;
        bisericaSfIosif.oameniPrezenti = 120;
        bisericaSfIosif.faSlujba();

        Biserica catedralaMN = new Biserica();
        catedralaMN.nume = "Catedrala Mantuirii Neamului";
        catedralaMN.latitudine =12.23;
        catedralaMN.longitudine =5.36;
        catedralaMN.tipReligie ="crestin ortodoxa";
        catedralaMN.program ="non stop";
        catedralaMN.buget =20000;
        catedralaMN.rating =5;
        catedralaMN.capacitate =500;
        catedralaMN.oameniPrezenti =320;
        catedralaMN.faSlujba();
    }
}
