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
public class Metal extends HardRock implements HeavyMetal{
    public void genreMetal(String artisName){
        System.out.println(artisName+"adalah genre Metal");
    }


    @Override
    public void genreHeavyMetal(String artisName) {
        System.out.println(artisName+"adalah genre Heavy Metal");
    }

    @Override
    public void genrePunk(String artisName) {
        System.out.println(artisName+"adalah genre Punk");
    }

    public void genreGrunge(String artisName){
        System.out.println(artisName+"adalah genre Grunge");
    }
}
