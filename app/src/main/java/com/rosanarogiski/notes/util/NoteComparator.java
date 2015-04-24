package com.rosanarogiski.notes.util;

import com.rosanarogiski.notes.bean.Note;

import java.util.Comparator;

/**
 * Created by Rosana Local on 23/04/2015.
 */
public class NoteComparator implements Comparator<Note> {

    @Override
    public int compare(Note n1, Note n2) {
        return n1.getTimestamp() < n2.getTimestamp() ? -1 : n1.getTimestamp() == n2.getTimestamp() ? 0 : 1;
    }
}
