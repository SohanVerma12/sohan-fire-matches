package com.example.datingcrod.Cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.example.datingcrod.R;

import java.util.List;


public class arrayAdapter extends ArrayAdapter<cards>{

    Context context;

    public arrayAdapter(Context context, int resourceId, List<cards> items){
        super(context, resourceId, items);
    }
    public View getView(int position, View convertView, ViewGroup parent){
        cards card_item = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_sohan, parent, false);
        }

        TextView name = (TextView) convertView.findViewById(R.id.name);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);
       /* TextView need = (TextView) convertView.findViewById(R.id.need);
        TextView give = (TextView) convertView.findViewById(R.id.give);*/
        TextView budget = (TextView) convertView.findViewById(R.id.budget);
        ImageView mNeedImage = (ImageView) convertView.findViewById(R.id.needImage);
        ImageView mGiveImage = (ImageView) convertView.findViewById(R.id.giveImage);

        name.setText(card_item.getName());
        /*need.setText(card_item.getNeed());
        give.setText(card_item.getGive());*/
        budget.setText(card_item.getBudget());

            //need image
            if(card_item.getNeed().equals("Netflix"))
                mNeedImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.netflix));
            else if(card_item.getNeed().equals("Amazon Prime"))
                mNeedImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.amazon_prime_video));
            else if(card_item.getNeed().equals("Hulu"))
                mNeedImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.hulu));
            else if(card_item.getNeed().equals("Vudu"))
                mNeedImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.vudu));
            else if(card_item.getNeed().equals("HBO Now"))
                mNeedImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.hbo));
            else if(card_item.getNeed().equals("Youtube Originals"))
                mNeedImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.youtube_tv));
            else
                mNeedImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.none));

            //give image
            if(card_item.getGive().equals("Smile"))
                mGiveImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.similer));
            else if(card_item.getGive().equals("Foodie"))
                mGiveImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.foodie));
            else if(card_item.getGive().equals("Crazy"))
                mGiveImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.crazy));
            else if(card_item.getGive().equals("Zombie dump"))
                mGiveImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.zombie));
            else if(card_item.getGive().equals("cool boy"))
                mGiveImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.coolboy));
            else if(card_item.getGive().equals("cool ladki"))
                mGiveImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.girlcool));
            else
                mGiveImage.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.none));


        switch(card_item.getProfileImageUrl()){
            case "default":
                Glide.with(convertView.getContext()).load(R.drawable.profile_images).into(image);
                break;
            default:
                Glide.clear(image);
                Glide.with(convertView.getContext()).load(card_item.getProfileImageUrl()).into(image);
                break;
        }


        return convertView;

    }
}
