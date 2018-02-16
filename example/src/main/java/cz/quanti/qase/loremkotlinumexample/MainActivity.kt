package cz.quanti.qase.loremkotlinumexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import cz.quanti.quase.loremkotlinum.Lorem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private val sb = StringBuilder()
    private val begMark = "»"
    private val endMark = "«"
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        toolbar.title = item.title
        val id = item.itemId

        when (id) {
            R.id.action_word -> {
                initHolder()
                for (i in 1..16) {
                    store2Holder( "♦ Lorem.word():\n"+ begMark + Lorem.word() + endMark)
                }

                displayHolder()
                return true
            }

            R.id.action_words -> {
                initHolder()
                for (i in 1..4) {
                    store2Holder( "♦ Lorem.words():\n"+ begMark + Lorem.words() + endMark)
                }

                for (i in 1..Lorem.maxWords) {
                    store2Holder( "♦ Lorem.words(" + i + "):\n"+ begMark + Lorem.words(i) + endMark)
                }

                displayHolder()
                return true
            }

            R.id.action_sentence -> {
                initHolder()
                for (i in 1..4) {
                    store2Holder( "♦ Lorem.sentnece():\n"+ begMark + Lorem.sentence() + endMark)
                }

                for (i in 1..Lorem.maxWords) {
                    store2Holder( "♦ Lorem.sentnece(" + i +"):\n"+ begMark + Lorem.sentence(i) + endMark)
                }

                displayHolder()
                return true
            }

            R.id.action_sentences -> {
                initHolder()
                for (i in 1..4) {
                    store2Holder( "♦ Lorem.sentences():\n"+ begMark + Lorem.sentences() + endMark)
                }

                for (i in 1..Lorem.maxSentences) {
                    store2Holder( "♦ Lorem.sentences(" + i + "):\n"+ begMark + Lorem.sentences(i) + endMark)
                }

                displayHolder()
                return true
            }

            R.id.action_paragraph -> {
                initHolder()
                for (i in 1..4) {
                    store2Holder( "♦ Lorem.paragraph():\n"+ begMark + Lorem.paragraph() + endMark)
                }
                for (i in 1..Lorem.maxSentences) {
                    store2Holder( "♦ Lorem.paragraph(" + i + "):\n"+ begMark + Lorem.paragraph(i) + endMark)
                }

                displayHolder()
                return true
            }

            R.id.action_paragraphs -> {
                initHolder()
                for (i in 1..4) {
                    store2Holder( "♦ Lorem.paragraphs():\n"+ begMark + Lorem.paragraphs() + endMark)
                }

                for (i in 1..Lorem.maxParagraphs) {
                    store2Holder( "♦ Lorem.paragraphs(" + i + "):\n"+ begMark + Lorem.paragraphs(i) + endMark)
                }

                displayHolder()
                return true
            }

            R.id.action_first_name -> {
                initHolder()
                for (i in 1..16) {
                    store2Holder( "♦ Lorem.firstName():\n"+ begMark + Lorem.firstName() + endMark)
                }

                displayHolder()
                return true
            }

            R.id.action_last_name -> {
                initHolder()
                for (i in 1..16) {
                    store2Holder( "♦ Lorem.lastName():\n"+ begMark + Lorem.lastName() + endMark)
                }

                displayHolder()
                return true
            }

            R.id.action_name -> {
                initHolder()
                for (i in 1..16) {
                    store2Holder( "♦ Lorem.name():\n"+ begMark + Lorem.name() + endMark)
                }

                displayHolder()
                return true
            }

            R.id.action_domain -> {
                initHolder()
                for (i in 1..16) {
                    store2Holder( "♦ Lorem.domain():\n"+ begMark + Lorem.domain() + endMark)
                }

                displayHolder()
                return true
            }

            R.id.action_email -> {
                initHolder()
                for (i in 1..16) {
                    store2Holder( "♦ Lorem.email():\n"+ begMark + Lorem.email() + endMark)
                }

                displayHolder()
                return true
            }

            R.id.action_tweet -> {
                initHolder()
                for (i in 1..16) {
                    store2Holder( "♦ Lorem.tweet():\n"+ begMark + Lorem.tweet() + endMark)
                }

                displayHolder()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun initHolder() {
        sb.delete(0, sb.length)
    }

    private fun store2Holder(string: String) {
        sb.append(string + "\n\n")
    }

    private fun displayHolder() {
        scroll_view.scrollTo(0, 0)
        text_view.text = sb.toString()
    }
}
