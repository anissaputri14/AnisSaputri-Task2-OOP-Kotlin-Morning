package exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */

    val hero = Hero()

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */

    hero.setProfile("Anis Saputri", 21, 157)


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    hero.profile()

    /**
    Challenge:
    Shelter Nerd -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x**/
    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    fun Challenge(walk: Int, run: Int, eat: Int, drink: Int, jump: Int, sit: Int) {

        repeat(walk) { hero.jalan() }
        repeat(run) { hero.lari() }
        repeat(eat) { hero.makan() }
        repeat(drink) { hero.minum() }
        repeat(jump) { hero.lompat() }
        repeat(sit) { hero.duduk() }
    }

    Challenge(4,1,3,5,5,3)



//    hero.jalan()
//    hero.lari()
//    hero.makan()
//    hero.minum()
//    hero.lompat()
//    hero.duduk()


    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    hero.profile()

}