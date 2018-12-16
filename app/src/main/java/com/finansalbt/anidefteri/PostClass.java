package com.finansalbt.anidefteri;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PostClass extends ArrayAdapter<String>{


    private  final ArrayList<String> useremail;
    private  final ArrayList<String> userdescription;
    private  final ArrayList<String> userImage;
    private  final Activity context;

    public PostClass(ArrayList<String> useremail, ArrayList<String> userdescription, ArrayList<String> userImage, Activity context) {
        super(context,R.layout.custom_view,useremail);
        this.useremail = useremail;
        this.userdescription = userdescription;
        this.userImage = userImage;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view,null,true);
        TextView userEmailText = customView.findViewById(R.id.userEmailTextViewCustomView);
        ImageView imageView = customView.findViewById(R.id.imageViewCustomView);
        TextView descriptionText = customView.findViewById(R.id.descriptionTextViewCustomView);

        userEmailText.setText(useremail.get(position));
        descriptionText.setText(userdescription.get(position));

        Picasso.get().load(userImage.get(position)).into(imageView);


        return customView;
    }
}
