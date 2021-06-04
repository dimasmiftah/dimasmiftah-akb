package me.dimasmiftah.dimasmiftah.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import me.dimasmiftah.dimasmiftah.AboutDialog;
import me.dimasmiftah.dimasmiftah.R;

/*
    Tanggal pengerjaan: Kamis, 25 Mei 2021
    NIM: 10118087
    Nama: Dimas Miftahul Huda
    Kelas: IF-2
*/

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    ImageView ivFacebook, ivInstagram, ivTwitter, ivWhatsapp, ivGmail, ivMap;
    TextView tvPhone, tvAbout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        ivFacebook = root.findViewById(R.id.iv_facebook);
        ivInstagram = root.findViewById(R.id.iv_instagram);
        ivTwitter = root.findViewById(R.id.iv_twitter);
        ivWhatsapp = root.findViewById(R.id.iv_whatsapp);
        ivGmail = root.findViewById(R.id.iv_gmail);
        ivMap = root.findViewById(R.id.iv_map);
        tvPhone = root.findViewById(R.id.tv_phone);
        tvAbout = root.findViewById(R.id.tv_about);

        // facebook
        ivFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent();
                fb.setAction(Intent.ACTION_VIEW);
                fb.addCategory(Intent.CATEGORY_BROWSABLE);
                fb.setData(Uri.parse("https://web.facebook.com/dimas.m.huda.9"));
                startActivity(fb);
            }
        });

        // instagram
        ivInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig = new Intent();
                ig.setAction(Intent.ACTION_VIEW);
                ig.addCategory(Intent.CATEGORY_BROWSABLE);
                ig.setData(Uri.parse("https://www.instagram.com/dimas.mfth"));
                startActivity(ig);
            }
        });

        // twitter
        ivTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tw = new Intent();
                tw.setAction(Intent.ACTION_VIEW);
                tw.addCategory(Intent.CATEGORY_BROWSABLE);
                tw.setData(Uri.parse("https://twitter.com/dimasmfth"));
                startActivity(tw);
            }
        });

        // whatsapp
        ivWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wa = new Intent();
                wa.setAction(Intent.ACTION_VIEW);
                wa.addCategory(Intent.CATEGORY_BROWSABLE);
                wa.setData(Uri.parse("https://api.whatsapp.com/send?phone=62881023242114"));
                startActivity(wa);
            }
        });

        // gmail
        ivGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gm = new Intent();
                gm.setAction(Intent.ACTION_VIEW);
                gm.addCategory(Intent.CATEGORY_BROWSABLE);
                gm.setData(Uri.parse("mailto:dimas.mfth@gmail.com"));
                startActivity(gm);
            }
        });

        // map
        ivMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent();
                map.setAction(Intent.ACTION_VIEW);
                map.addCategory(Intent.CATEGORY_BROWSABLE);
                map.setData(Uri.parse("https://goo.gl/maps/3T5KkX2KV1Qqysph6"));
                startActivity(map);
            }
        });

        // phone
        tvPhone.setText("085157478077");
        Linkify.addLinks(tvPhone, Linkify.PHONE_NUMBERS);

        // about
        tvAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutDialog aboutDialog = new AboutDialog();
                aboutDialog.show(getFragmentManager(),"AboutDialogFragment");
            }
        });

        return root;
    }
}