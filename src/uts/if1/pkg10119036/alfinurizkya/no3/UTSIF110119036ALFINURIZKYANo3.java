/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119036.alfinurizkya.no3;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program :
 */
public class UTSIF110119036ALFINURIZKYANo3 {

   public static void main(String[] args) {
        Folk folk = new Folk();
        folk.setArtisName("Bob Dylan");
        folk.genreFolk(folk.getArtisName());

        Rnb rnb1, rnb2;
        rnb1 = new Rnb();
        rnb1.setArtisName("Jimmy Hendirik");
        rnb1.genreBlues(rnb1.getArtisName());

        rnb2 = new Rnb();
        rnb2.setArtisName("Chad Baker");
        rnb2.genreJazz(rnb2.getArtisName());

        Rockabilly rockabilly = new Rockabilly();
        rockabilly.setArtisName("Elvis Presley");
        rockabilly.genreRockabilly(rockabilly.getArtisName());

        Metal metal = new Metal();
        metal.setArtisName("DreamTheater");
        metal.genreProgressive(metal.getArtisName());

        metal.setArtisName("The Doors");
        metal.genrePsychedelic(metal.getArtisName());

        metal.setArtisName("Kiss");
        metal.genrePopRock(metal.getArtisName());

        metal.setArtisName("MXPX");
        metal.genrePopRock(metal.getArtisName());

        metal.setArtisName("METALLICA");
        metal.genreHeavyMetal(metal.getArtisName());

        Grindcore grindcore = new Grindcore();
        grindcore.setArtisName("Mesin Tempur");
        grindcore.genreGrindcore(grindcore.getArtisName());

        DeathMetal deathMetal = new DeathMetal();
        deathMetal.setArtisName("JASAD");
        deathMetal.genreDeathMetal(deathMetal.getArtisName());

        DeatCoreKepiting deathCoreKepiting = new DeatCoreKepiting();
        deathCoreKepiting.setArtisName("Revenge The Fate");
        deathCoreKepiting.genreDeathCoreKepiting(deathCoreKepiting.getArtisName());

        BlackMetal blackMetal = new BlackMetal();
        blackMetal.setArtisName("Behemoth");
        blackMetal.genreBlackMetal(blackMetal.getArtisName());

        NewSkul newSkul = new NewSkul();
        newSkul.setArtisName("HATEBREED");
        newSkul.genreNewSkul(newSkul.getArtisName());

    }
}
