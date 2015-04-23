package com.rosanarogiski.notes.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.rosanarogiski.notes.R;
import com.rosanarogiski.notes.bean.Note;

import java.util.ArrayList;
import java.util.List;


public class NoteAdapter extends BaseAdapter {

    private List<Note> dataList;
    private Activity activity;

    public NoteAdapter(Activity activity) {
        this.activity = activity;
        dataList = new ArrayList<Note>();
    }

    public void setDataList(List<Note> dataList) {
        this.dataList = dataList;

        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return dataList.get(position).getTitle().hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = activity.getLayoutInflater().inflate(R.layout.adapter_note, null);

        TextView noteTitle = (TextView) convertView.findViewById(R.id.noteTitle);
        RatingBar noteRating = (RatingBar) convertView.findViewById(R.id.noteRating);
        ImageView noteThumbnail = (ImageView) convertView.findViewById(R.id.noteThumbnail);

        Note note = dataList.get(position);

        noteTitle.setText(note.getTitle());
        noteRating.setRating(note.getRating());

        if (note.getImage() != null) {
            noteThumbnail.setImageBitmap(note.getImage());
        }

        return convertView;
    }
}
