package cz.quanti.qase.loremkotlinum

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    val sb = StringBuilder();
    
    val begSign = "»"
    val endSign = "«"
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        toolbar.setTitle(item.title)
        val id = item.itemId

        when (id) {
            R.id.action_word -> {
                initHolder()
                for (i in 1..16) {
                    store2Holder( "♦ word():\n"+ begSign + Lorem.word() + endSign)
                }

                dispayHolder()
                return true
            }
            R.id.action_words -> {
                initHolder()
                for (i in 1..4) {
                    store2Holder( "♦ words():\n"+ begSign + Lorem.words() + endSign)
                }

                for (i in 1..16) {
                    store2Holder( "♦ words(" + i + "):\n"+ begSign + Lorem.words(i) + endSign)
                }

                dispayHolder()
                return true
            }
            R.id.action_sentence -> {
                initHolder()
                for (i in 1..4) {
                    store2Holder( "♦ sentnece():\n"+ begSign + Lorem.sentence() + endSign)
                }

                for (i in 1..16) {
                    store2Holder( "♦ sentnece(" + i +"):\n"+ begSign + Lorem.sentence(i) + endSign)
                }

                dispayHolder()
                return true
            }
            R.id.action_sentences -> {
                initHolder()
                for (i in 1..4) {
                    store2Holder( "♦ sentences():\n"+ begSign + Lorem.sentences() + endSign)
                }

                for (i in 1..16) {
                    store2Holder( "♦ sentences(" + i + "):\n"+ begSign + Lorem.sentences(i) + endSign)
                }

                dispayHolder()
                return true
            }
            R.id.action_paragraph -> {
                initHolder()
                for (i in 1..4) {
                    store2Holder( "♦ paragraph():\n"+ begSign + Lorem.paragraph() + endSign)
                }
                for (i in 1..16) {
                    store2Holder( "♦ paragraph(" + i + "):\n"+ begSign + Lorem.paragraph(i) + endSign)
                }

                dispayHolder()
                return true
            }
            R.id.action_paragraphs -> {
                initHolder()
                for (i in 1..4) {
                    store2Holder( "♦ paragraphs():\n"+ begSign + Lorem.paragraphs() + endSign)
                }

                for (i in 1..16) {
                    store2Holder( "♦ paragraphs(" + i + "):\n"+ begSign + Lorem.paragraphs(i) + endSign)
                }

                dispayHolder()
                return true
            }
        }

            return super.onOptionsItemSelected(item)
    }

    fun initHolder() {
        sb.delete(0, sb.length)
        sb.append("Characters " + begSign + " and " + endSign + " are not part of the text.\n\n")
    }
    
    fun store2Holder(string: String) {
        sb.append(string + "\n\n")
    }

    fun dispayHolder() {
        scroll_view.scrollTo(0, 0)
        text_view.setText(sb.toString())
    }
    
    fun xxx() {

        for (i in 1..8) {
            store2Holder( "paragraph():\n"+ begSign + Lorem.paragraph())
        }

        for (i in 1..8) {
            store2Holder( "paragraph(" + i + "):\n"+ begSign + Lorem.paragraph(i))
        }

        for (i in 1..8) {
            store2Holder( "paragraphs():\n"+ begSign + Lorem.paragraphs())
        }

        for (i in 1..8) {
            store2Holder( "paragraphs(" + i + "):\n"+ begSign + Lorem.paragraphs(i))
        }

        for (i in 1..8) {
            store2Holder( "email:\n"+ begSign + Lorem.email())
        }

        for (i in 1..8) {
            store2Holder( "tweet:\n"+ begSign + Lorem.tweet())
        }

        dispayHolder()
    }
}
