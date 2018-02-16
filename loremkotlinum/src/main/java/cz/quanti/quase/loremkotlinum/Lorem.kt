package cz.quanti.quase.loremkotlinum

import java.util.Random

object Lorem {

    val minWords = 1
    val maxWords = 32
    val minSentences = 1
    val maxSentences = 16
    val minParagraps = 1
    val maxParagraps = 8

    private val allWords = "alias consequatur aut perferendis sit voluptatem accusantium doloremque aperiam eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo aspernatur aut odit aut fugit sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt neque dolorem ipsum quia dolor sit amet consectetur adipisci velit sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem ut enim ad minima veniam quis nostrum exercitationem ullam corporis nemo enim ipsam voluptatem quia voluptas sit suscipit laboriosam nisi ut aliquid ex ea commodi consequatur quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae et iusto odio dignissimos ducimus qui blanditiis praesentium laudantium totam rem voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident sed ut perspiciatis unde omnis iste natus error similique sunt in culpa qui officia deserunt mollitia animi id est laborum et dolorum fuga et harum quidem rerum facilis est et expedita distinctio nam libero tempore cum soluta nobis est eligendi optio cumque nihil impedit quo porro quisquam est qui minus id quod maxime placeat facere possimus omnis voluptas assumenda est omnis dolor repellendus temporibus autem quibusdam et aut consequatur vel illum qui dolorem eum fugiat quo voluptas nulla pariatur at vero eos et accusamus officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae itaque earum rerum hic tenetur a sapiente delectus ut aut reiciendis voluptatibus maiores doloribus asperiores repellat"
    private val firstNames = "Judith Angelo Margarita Kerry Elaine Lorenzo Justice Doris Raul Liliana Kerry Elise Ciaran Johnny Moses Davion Penny Mohammed Harvey Sheryl Hudson Brendan Brooklynn Denis Sadie Trisha Jacquelyn Virgil Cindy Alexa Marianne Giselle Casey Alondra Angela Katherine Skyler Kyleigh Carly Abel Adrianna Luis Dominick Eoin Noel Ciara Roberto Skylar Brock Earl Dwayne Jackie Hamish Sienna Nolan Daren Jean Shirley Connor Geraldine Niall Kristi Monty Yvonne Tammie Zachariah Fatima Ruby Nadia Anahi Calum Peggy Alfredo Marybeth Bonnie Gordon Cara John Staci Samuel Carmen Rylee Yehudi Colm Beth Dulce Darius inley Javon Jason Perla Wayne Laila Kaleigh Maggie Don Quinn Collin Aniya Zoe Isabel Clint Leland Esmeralda Emma Madeline Byron Courtney Vanessa Terry Antoinette George Constance Preston Rolando Caleb Kenneth Lynette Carley Francesca Johnnie Jordyn Arturo Camila Skye Guy Ana Kaylin Nia Colton Bart Brendon Alvin Daryl Dirk Mya Pete Joann Uriel Alonzo Agnes Chris Alyson Paola Dora Elias Allen Jackie Eric Bonita Kelvin Emiliano Ashton Kyra Kailey Sonja Alberto Ty Summer Brayden Lori Kelly Tomas Joey Billie Katie Stephanie Danielle Alexis Jamal Kieran Lucinda Eliza Allyson Melinda Alma Piper Deana Harriet Bryce Eli Jadyn Rogelio Orlaith Janet Randal Toby Carla Lorie Caitlyn Annika Isabelle inn Ewan Maisie Michelle Grady Ida Reid Emely Tricia Beau Reese Vance Dalton Lexi Rafael Makenzie Mitzi Clinton Xena Angelina Kendrick Leslie Teddy Jerald Noelle Neil Marsha Gayle Omar Abigail Alexandra Phil Andre Billy Brenden Bianca Jared Gretchen Patrick Antonio Josephine Kyla Manuel Freya Kellie Tonia Jamie Sydney Andres Ruben Harrison Hector Clyde Wendell Kaden Ian Tracy Cathleen Shawn Many"
    private val lastNames = "Chung Chen Melton Hill Puckett Song Hamilton Bender Wagner McLaughlin McNamara Raynor Moon Woodard Desai Wallace Lawrence Griffin Dougherty Powers May Steele Teague Vick Gallagher Solomon Walsh Monroe Connolly Hawkins Middleton Goldstein Watts Johnston Weeks Wilkerson Barton Walton Hall Ross Chung Bender Woods Mangum Joseph Rosenthal Bowden Barton Underwood Jones Baker Merritt Cross Cooper Holmes Sharpe Morgan Hoyle Allen Rich Rich Grant Proctor Diaz Graham Watkins Hinton Marsh Hewitt Branch Walton O'Brien Case Watts Christensen Parks Hardin Lucas Eason Davidson Whitehead Rose Sparks Moore Pearson Rodgers Graves Scarborough Sutton Sinclair Bowman Olsen Love McLean Christian Lamb James Chandler Stout Cowan Golden Bowling Beasley Clapp Abrams Tilley Morse Boykin Sumner Cassidy Davidson Heath Blanchard McAllister McKenzie Byrne Schroeder Griffin Gross Perkins Robertson Palmer Brady Rowe Zhang Hodge Li Bowling Justice Glass Willis Hester Floyd Graves Fischer Norman Chan Hunt Byrd Lane Kaplan Heller May Jennings Hanna Locklear Holloway Jones Glover Vick O'Donnell Goldman McKenna Starr Stone McClure Watson Monroe Abbott Singer Hall Farrell Lucas Norman Atkins Monroe Robertson Sykes Reid Chandler Finch Hobbs Adkins Kinney Whitaker Alexander Conner Waters Becker Rollins Love Adkins Black Fox Hatcher Wu Lloyd Joyce Welch Matthews Chappell MacDonald Kane Butler Pickett Bowman Barton Kennedy Branch Thornton McNeill Weinstein Middleton Moss Lucas Rich Carlton Brady Schultz Nichols Harvey Stevenson Houston Dunn West O'Brien Barr Snyder Cain Heath Boswell Olsen Pittman Weiner Petersen Davis Coleman Terrell Norman Burch Weiner Parrott Henry Gray Chang McLean Eason Weeks Siegel Puckett Heath Hoyle Garrett Neal Baker Goldman Shaffer Choi Carver More"
    private val emailDomains = "gmail.com yahoo.com hotmail.com email.com live.com me.com mac.com aol.com fastmail.com mail.com"
    private val emailDelimiters = arrayOf("", ".", "-", "_")
    private val domains = "twitter.com google.com youtube.com wordpress.org adobe.com blogspot.com godaddy.com wikipedia.org wordpress.com linkedin.com amazon.com flickr.com w3.org apple.com myspace.com tumblr.com digg.com microsoft.com vimeo.com pinterest.com stumbleupon.com youtu.be miibeian.gov.cn feedburner.com bit.ly"
    private val tweets = arrayOf("Far away, in a forest next to a river beneath the mountains, there lived a small purple otter called Philip. Philip likes sausages. The End.", "He liked the quality sausages from Marks & Spencer but due to the recession he had been forced to shop in a less desirable supermarket. End.", "He awoke one day to find his pile of sausages missing. Roger the greedy boar with human eyes, had skateboarded into the forest & eaten them!", "Five to one, baby One in five. No one here gets out alive.")

    enum class Separator(val str: String) {
        NONE(""),
        SPACE(" "),
        DOT("."),
        NEWLINE("\n")
    }

    private val rand = Random()

    private fun getRandomElement(sArr: Array<String>): String {
        val index = rand.nextInt(sArr.size)
        return sArr[index]
    }

    private fun getRandomElement(s: String): String {
        return getRandomElement(s.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())
    }

    private fun compose(anComposer: () -> String, count: Int, middleSeparator: String, endSeparator: String): String {
        var retStr = ""
        for (i in 0 until count) {
            if (i > 0) {
                retStr += middleSeparator;
            }
            retStr += anComposer.invoke()
        }

        retStr += endSeparator

        return retStr
    }

    fun word(): String {
        return getRandomElement(allWords)
    }

    fun words(): String {
        return words(rand.nextInt(maxWords - minWords) + minWords)
    }

    fun words(count: Int): String {
        var retStr = compose({ word() }, count, Separator.SPACE.str, Separator.NONE.str)

        return retStr
    }

    fun sentence(): String {
        return sentence(rand.nextInt(maxWords - minWords) + minWords)
    }

    fun sentence(words: Int): String {
        var count = words
        if (count < minWords) {
            count = minWords
        } else if (count > maxWords) {
            count = maxWords
        }

        return compose({ word() }, count, Separator.SPACE.str, Separator.DOT.str).capitalize()
    }

    fun sentences(): String {
        return sentences(rand.nextInt(maxSentences - minSentences) + minSentences)
    }

    fun sentences(sentences: Int): String {
        var count = sentences
        if (count < minSentences) {
            count = minSentences
        } else if (count > maxSentences) {
            count = maxSentences
        }

        return compose({ sentence() }, count, Separator.SPACE.str, Separator.NONE.str)
    }

    fun paragraph(): String {
        return paragraph(rand.nextInt(maxSentences - minSentences) + minSentences)
    }

    fun paragraph(sentences: Int): String {
        var count = sentences
        if (count < minSentences) {
            count = minSentences
        } else if (count > maxSentences) {
            count = maxSentences
        }

        return compose({ sentence() }, count, Separator.SPACE.str, Separator.NEWLINE.str)
    }

    fun paragraphs(): String {
        return paragraphs(rand.nextInt(maxParagraps - minParagraps) + minParagraps)
    }

    fun paragraphs(paragraphs: Int): String {
        var count = paragraphs
        if (count < minParagraps) {
            count = minParagraps
        } else if (count > maxParagraps) {
            count = maxParagraps
        }

        return compose({ paragraph() }, count, Separator.NONE.str, Separator.NONE.str)
    }

    fun firstName(): String {
        return getRandomElement(firstNames)
    }

    fun lastName(): String {
        return getRandomElement(lastNames)
    }

    fun name(): String {
        return firstName() + Separator.SPACE.str + lastName()
    }

    fun emailDomain(): String {
        return getRandomElement(emailDomains)
    }

    fun domain(): String {
        return getRandomElement(emailDomains + " " + domains)
    }

    fun email(): String {
        return (firstName() + delimiter() + lastName() + "@" + emailDomain()).toLowerCase()
    }

    fun tweet(): String {
        return getRandomElement(tweets)
    }

    fun delimiter(): String {
        return getRandomElement(emailDelimiters)
    }

}
