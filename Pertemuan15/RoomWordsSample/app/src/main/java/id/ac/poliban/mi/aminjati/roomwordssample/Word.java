package id.ac.poliban.mi.aminjati.roomwordssample;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    @Ignore
    public Word(@NonNull String word, int id) {this.mWord = word; this.id = id; }
    public Word(@NonNull String word) {this.mWord = word;}
    public String getWord() {return this.mWord; }
    public int getId() {return this.id; }
    public void setId(int id) { this.id = id;}
}
