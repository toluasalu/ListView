package com.example.listviewapp.data

import com.example.listviewapp.R
import com.example.listviewapp.model.FunFact

object Datasource {
    fun loadFunFacts(): List<FunFact> {
        return listOf<FunFact>(
                FunFact(
                        "Kotlin",
                         R.drawable.kotlin_1_logo_png_transparent,
                        "The name comes from Kotlin Island, near St Petersburg.Andrey Breslav mentioned that " +
                                "the team decided to name it after an island"),

                FunFact("Java",
                        R.drawable.java_4_logo_png_transparent,
                        "The language was initially called Oak after an oak tree that stood outside Gosling's office." +
                                "Later the project went by the name Green and was finally renamed Java, from Java coffee, " +
                                "a type of coffee from Indonesia"),

                FunFact("Python",
                        R.drawable.python_5_logo_png_transparent,
                        "Why is it called Python! ... When he began implementing Python, " +
                                "Guido van Rossum was also reading "),

                FunFact("Javascript",
                        R.drawable.javascript_logo_png_transparent,
                        "The name JavaScript came from Netscape's support of java applets within it's browser"),

                FunFact("Php",
                        R.drawable.php_logo_png,
                        "Php originally stood for Personal Home Page, but now it stands for the " +
                                "recursive initialism PHP: Hypertext Preprocessor"))
    }
}