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
public class HardRock extends Rnb implements PopRock, ProgressiveRock, PsychedelicRock {
    public void genreHardRock(String artisName){
        System.out.println(artisName+"adalah genre Hard Rock");
    }

    @Override
    public void genrePopRock(String artisName){
        System.out.println(artisName+"adalah genre Pop Rock");
    }

    @Override
    public void genrePsychedelic(String artisName){
        System.out.println(artisName+"adalah genre Psychedelic");
    }

    @Override
    public void genreProgressive(String artisName) {
        System.out.println(artisName+"adalah genre Progressive");
    }
}
