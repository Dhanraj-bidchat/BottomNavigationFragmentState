package com.example.bottomnavigationfragmentstate.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bottomnavigationfragmentstate.model.Chapter
import com.example.bottomnavigationfragmentstate.model.Subject

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text


    fun prepareData(): ArrayList<Subject> {
        val subjects: ArrayList<Subject> = arrayListOf()

        /**
         * first add category , brands and browse menu handler
         */
        val categories = Subject(1000,"Popular Categories", arrayListOf(), 1)
        val brands = Subject(1001,"Top Brands", arrayListOf(), 1)
        val menu = Subject(1002,"Browse Menu", arrayListOf(), 1)
        subjects.add(categories)
        subjects.add(brands)
        subjects.add(menu)

        //////S START
        val chapter1 = Chapter(1, "Atomic power", "https://media.istockphoto.com/id/915681526/photo/bandra-worli-sea-link-mumbai.jpg?s=1024x1024&w=is&k=20&c=L5ZbPXc0iBCgz7zL6nP-Det8lXCLXeUxxBW8TBNPLVQ=")
        val chapter2 = Chapter(2, "Theory of relativity", "https://randomwordgenerator.com/img/picture-generator/53e0d6474954a914f1dc8460962e33791c3ad6e04e5074417c2f7cd39245cc_640.jpg")
        val chapter3 = Chapter(3, "Magnetic field", "https://randomwordgenerator.com/img/picture-generator/57e7d0454b57ac14f1dc8460962e33791c3ad6e04e50744172297cd59344c5_640.jpg")
        val chapter4 = Chapter(4, "Practical 1", "https://randomwordgenerator.com/img/picture-generator/57e9d6464b52a814f1dc8460962e33791c3ad6e04e507440742a7ed1964bc6_640.jpg")
        val chapter5 = Chapter(5, "Practical 2", "https://randomwordgenerator.com/img/picture-generator/53e0d7464e50ac14f1dc8460962e33791c3ad6e04e50744172277ed7924ac6_640.jpg")

        val subject = Subject(1,"Physics", arrayListOf(chapter1, chapter2, chapter3, chapter4, chapter5))
        //////S END

        //////S START
        val chapter12 = Chapter(1, "Chemical bonds", "https://randomwordgenerator.com/img/picture-generator/54e9d4444e55ae14f1dc8460962e33791c3ad6e04e5074417d2e72d2914ec3_640.jpg")
        val chapter22 = Chapter(2, "Sodium", "https://randomwordgenerator.com/img/picture-generator/brushes-1683134_640.jpg")
        val chapter32 = Chapter(3, "Periodic table", "https://randomwordgenerator.com/img/picture-generator/55e0d0414d52a914f1dc8460962e33791c3ad6e04e507441722872d6964ac5_640.jpg")
        val chapter42 = Chapter(4, "Acid and Base", "https://randomwordgenerator.com/img/picture-generator/51e3d4424d53b10ff3d8992cc12c30771037dbf85254784b7d297ed7934b_640.jpg")
        val chapter52 = Chapter(5, "Practical 2", "https://randomwordgenerator.com/img/picture-generator/52e3d74a4b50a514f1dc8460962e33791c3ad6e04e507749742c78d59e45cc_640.jpg")

        val subject2 = Subject(2,"Chemistry", arrayListOf(chapter12, chapter22, chapter32, chapter42, chapter52))
        //////S END

        //////S START
        val chapter123 = Chapter(1, "Chemical bonds", "https://randomwordgenerator.com/img/picture-generator/57e2d54a4253aa14f1dc8460962e33791c3ad6e04e50744172297bd59749c5_640.jpg")
        val chapter223 = Chapter(2, "Sodium", "http://ashishkudale.com/images/chem/sodium.png")
        val chapter323 = Chapter(3, "Periodic table", "http://ashishkudale.com/images/chem/periodic_table.png")
        val chapter423 = Chapter(4, "Acid and Base", "http://ashishkudale.com/images/chem/chem.png")
        val chapter523 = Chapter(5, "Practical 2", "http://ashishkudale.com/images/phy/micrometer.png")

        val subject3 = Subject(3,"Biology", arrayListOf(chapter123, chapter223, chapter323, chapter423, chapter523))
        //////S END

        //////S START
        val chapter14 = Chapter(1, "Chemical bonds", "https://randomwordgenerator.com/img/picture-generator/55e7d0404e55a814f1dc8460962e33791c3ad6e04e507441722872d6954dc5_640.jpg")
        val chapter24 = Chapter(2, "Sodium", "http://ashishkudale.com/images/chem/sodium.png")
        val chapter34 = Chapter(3, "Periodic table", "http://ashishkudale.com/images/chem/periodic_table.png")
        val chapter44 = Chapter(4, "Acid and Base", "http://ashishkudale.com/images/chem/chem.png")
        val chapter54 = Chapter(5, "Practical 2", "http://ashishkudale.com/images/phy/micrometer.png")

        val subject4 = Subject(4,"subject4", arrayListOf(chapter14, chapter24, chapter34, chapter44, chapter54))
        //////S END

        //////S START
        val chapter15 = Chapter(1, "Chemical bonds", "https://randomwordgenerator.com/img/picture-generator/51e6dd444a54b10ff3d8992cc12c30771037dbf85254794e732f7bd49344_640.jpg")
        val chapter25 = Chapter(2, "Sodium", "http://ashishkudale.com/images/chem/sodium.png")
        val chapter35 = Chapter(3, "Periodic table", "http://ashishkudale.com/images/chem/periodic_table.png")
        val chapter45 = Chapter(4, "Acid and Base", "http://ashishkudale.com/images/chem/chem.png")
        val chapter55 = Chapter(5, "Practical 2", "http://ashishkudale.com/images/phy/micrometer.png")

        val subject5 = Subject(5,"subject5", arrayListOf(chapter15, chapter25, chapter35, chapter45, chapter55))
        //////S END

        //////S START
        val chapter16 = Chapter(1, "Atomic power", "https://randomwordgenerator.com/img/picture-generator/54e7d7404853a914f1dc8460962e33791c3ad6e04e507440752972d29e4bc3_640.jpg")
        val chapter26 = Chapter(2, "Theory of relativity", "http://ashishkudale.com/images/phy/sigma.png")
        val chapter36 = Chapter(3, "Magnetic field", "http://ashishkudale.com/images/phy/magnet.png")
        val chapter46 = Chapter(4, "Practical 1", "http://ashishkudale.com/images/phy/caliper.png")
        val chapter56 = Chapter(5, "Practical 2", "http://ashishkudale.com/images/phy/micrometer.png")

        val subject6 = Subject(6,"subject6", arrayListOf(chapter16, chapter26, chapter36, chapter46, chapter56))
        //////S END

        //////S START
        val chapter17 = Chapter(1, "Atomic power", "https://randomwordgenerator.com/img/picture-generator/kyle-brinker-0vVHYD3PcKo-unsplash.jpg")
        val chapter27 = Chapter(2, "Theory of relativity", "http://ashishkudale.com/images/phy/sigma.png")
        val chapter37 = Chapter(3, "Magnetic field", "http://ashishkudale.com/images/phy/magnet.png")
        val chapter47 = Chapter(4, "Practical 1", "http://ashishkudale.com/images/phy/caliper.png")
        val chapter57 = Chapter(5, "Practical 2", "http://ashishkudale.com/images/phy/micrometer.png")

        val subject7 = Subject(7,"subject7", arrayListOf(chapter17, chapter27, chapter37, chapter47, chapter57))
        //////S END

        //////S START
        val chapter8a = Chapter(1, "Atomic power", "https://randomwordgenerator.com/img/picture-generator/54e9d4444e55ae14f1dc8460962e33791c3ad6e04e5074417d2e72d2914ec3_640.jpg")
        val chapter8b = Chapter(2, "Theory of relativity", "http://ashishkudale.com/images/phy/sigma.png")
        val chapter8c = Chapter(3, "Magnetic field", "http://ashishkudale.com/images/phy/magnet.png")
        val chapter8d = Chapter(4, "Practical 1", "http://ashishkudale.com/images/phy/caliper.png")
        val chapter8e = Chapter(5, "Practical 2", "http://ashishkudale.com/images/phy/micrometer.png")

        val subject8 = Subject(8,"subject8", arrayListOf(chapter8a, chapter8b, chapter8c, chapter8d, chapter8e))
        //////S END

        //////S START
        val chapter9a = Chapter(1, "Atomic power", "https://randomwordgenerator.com/img/picture-generator/jr-korpa-5-5hOa7ncnw-unsplash.jpg")
        val chapter9b = Chapter(2, "Theory of relativity", "http://ashishkudale.com/images/phy/sigma.png")
        val chapter9c = Chapter(3, "Magnetic field", "http://ashishkudale.com/images/phy/magnet.png")
        val chapter9d = Chapter(4, "Practical 1", "http://ashishkudale.com/images/phy/caliper.png")
        val chapter9e = Chapter(5, "Practical 2", "http://ashishkudale.com/images/phy/micrometer.png")

        val subject9 = Subject(9,"subject9", arrayListOf(chapter9a, chapter9b, chapter9c, chapter9d, chapter9e))
        //////S END

        //////S START
        val chapter10a = Chapter(1, "Atomic power", "https://randomwordgenerator.com/img/picture-generator/gfd0532c29fe21e9876c09ac55ae24841b4ee20a86fec334649c0e743d9732e53f3bc22e8528d0523e08e7883fe558858_640.jpg")
        val chapter10b = Chapter(2, "Theory of relativity", "http://ashishkudale.com/images/phy/sigma.png")
        val chapter10c = Chapter(3, "Magnetic field", "http://ashishkudale.com/images/phy/magnet.png")
        val chapter10d = Chapter(4, "Practical 1", "http://ashishkudale.com/images/phy/caliper.png")
        val chapter10e = Chapter(5, "Practical 2", "http://ashishkudale.com/images/phy/micrometer.png")

        val subject10 = Subject(10,"subject10", arrayListOf(chapter10a, chapter10b, chapter10c, chapter10d, chapter10e))
        //////S END

        subjects.add(subject)
        subjects.add(subject2)
        subjects.add(subject3)
        subjects.add(subject4)
        subjects.add(subject5)
        subjects.add(subject6)
        subjects.add(subject7)
        subjects.add(subject8)
        subjects.add(subject9)
        subjects.add(subject10)


        for (i in 11..250) {
            //////S START
            val chaptera = Chapter(1, "Atomic power${i}", "https://randomwordgenerator.com/img/picture-generator/5ee6d6434f5ab10ff3d8992cc12c30771037dbf85254794e732872d2964e_640.jpg")
            val chapterb = Chapter(2, "Theory of relativity${i}", "https://randomwordgenerator.com/img/picture-generator/57e9d6404252b10ff3d8992cc12c30771037dbf85257714b7d267add964b_640.jpg")
            val chapterc = Chapter(3, "Magnetic field${i}", "https://randomwordgenerator.com/img/picture-generator/54e7d6464d50ab14f1dc8460962e33791c3ad6e04e5074417d2d73dc974bc2_640.jpg")
            val chapterd = Chapter(4, "Practical 1${i}", "https://randomwordgenerator.com/img/picture-generator/57e4d2444251ac14f1dc8460962e33791c3ad6e04e50744172277fd79f4ec4_640.jpg")
            val chaptere = Chapter(5, "Practical 2${i}", "https://randomwordgenerator.com/img/picture-generator/bruno-garcia-XMPwgf8ivX8-unsplash.jpg")
            val chapterf = Chapter(6, "Practical 3${i}", "https://randomwordgenerator.com/img/picture-generator/bruno-garcia-XMPwgf8ivX8-unsplash.jpg")
            val chapterg = Chapter(7, "Practical 4${i}", "https://randomwordgenerator.com/img/picture-generator/bruno-garcia-XMPwgf8ivX8-unsplash.jpg")
            val chapterh = Chapter(8, "Practical 5${i}", "https://randomwordgenerator.com/img/picture-generator/bruno-garcia-XMPwgf8ivX8-unsplash.jpg")
            val chapteri = Chapter(9, "Practical 6${i}", "https://randomwordgenerator.com/img/picture-generator/bruno-garcia-XMPwgf8ivX8-unsplash.jpg")
            val chapterj = Chapter(10, "Practical 7${i}", "https://randomwordgenerator.com/img/picture-generator/bruno-garcia-XMPwgf8ivX8-unsplash.jpg")
            val chapterk = Chapter(11, "Practical 8${i}", "https://randomwordgenerator.com/img/picture-generator/bruno-garcia-XMPwgf8ivX8-unsplash.jpg")
            val chapterl = Chapter(12, "Practical 9${i}", "https://randomwordgenerator.com/img/picture-generator/bruno-garcia-XMPwgf8ivX8-unsplash.jpg")
            val chapterm = Chapter(13, "Practical 10${i}", "https://randomwordgenerator.com/img/picture-generator/bruno-garcia-XMPwgf8ivX8-unsplash.jpg")
            val chaptern = Chapter(14, "Practical 11${i}", "https://randomwordgenerator.com/img/picture-generator/bruno-garcia-XMPwgf8ivX8-unsplash.jpg")
            val chaptero = Chapter(15, "Practical 12${i}", "https://randomwordgenerator.com/img/picture-generator/bruno-garcia-XMPwgf8ivX8-unsplash.jpg")

            val subject = Subject(10,"subject${i}", arrayListOf(chaptera, chapterb, chapterc, chapterd, chaptere, chapterf, chapterg, chapterh, chapteri, chapterj, chapterk, chapterl, chapterm, chaptern, chaptero))
            subjects.add(subject)
            //////S END
        }
        return subjects
    }
}