package me.dimasmiftah.dimasmiftah.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.dimasmiftah.dimasmiftah.Adapter.DailyAdapter;
import me.dimasmiftah.dimasmiftah.Adapter.FriendlistAdapter;
import me.dimasmiftah.dimasmiftah.Model.DailyModel;
import me.dimasmiftah.dimasmiftah.Model.FriendlistModel;
import me.dimasmiftah.dimasmiftah.R;

import java.util.ArrayList;

/*
    Tanggal pengerjaan: Kamis, 29 Mei 2021
    NIM: 10118087
    Nama: Dimas Miftahul Huda
    Kelas: IF-2
*/

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DailyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DailyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
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

    // views dailyact
    RecyclerView recyclerViewDaily;
    ArrayList<DailyModel> dailyModel;
    // views friendlist
    RecyclerView recyclerViewFriendlist;
    ArrayList<FriendlistModel> friendlistModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        // daliyact
        recyclerViewDaily = root.findViewById(R.id.recview_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        DailyModel daily1 = new DailyModel(R.drawable.daily_eat, "Makan", "Saya suka makan sambil menonton film");
        dailyModel.add(daily1);
        DailyModel daily2 = new DailyModel(R.drawable.daily_learn, "Kuliah", "Saat ini saya berkuliah secara daring");
        dailyModel.add(daily2);
        DailyModel daily3 = new DailyModel(R.drawable.daily_tiktok, "Membuat Konten", "Saya aktif membuat konten tiktok");
        dailyModel.add(daily3);
        DailyModel daily4 = new DailyModel(R.drawable.daily_code, "Ngulik", "Saya sedang belajar Web Development di Dicoding");
        dailyModel.add(daily4);
        DailyModel daily5 = new DailyModel(R.drawable.daily_game, "Bermain Game", "Akhir-akhir ini sedang suka main Mobile Legend");
        dailyModel.add(daily5);
        DailyModel daily6 = new DailyModel(R.drawable.daily_movie, "Nonton Film", "Saya sedang marathon nonton Marvel");
        dailyModel.add(daily6);

        recyclerViewDaily.setAdapter(new DailyAdapter(dailyModel));

        // friendlist
        recyclerViewFriendlist = root.findViewById(R.id.recview_friendlist);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        friendlistModel = new ArrayList<>();

        FriendlistModel friendlist1 = new FriendlistModel(R.drawable.friend1, "Benno");
        friendlistModel.add(friendlist1);
        FriendlistModel friendlist2 = new FriendlistModel(R.drawable.friend2, "Andri");
        friendlistModel.add(friendlist2);
        FriendlistModel friendlist3 = new FriendlistModel(R.drawable.friend3, "Yunus");
        friendlistModel.add(friendlist3);
        FriendlistModel friendlist4 = new FriendlistModel(R.drawable.friend4, "Dion");
        friendlistModel.add(friendlist4);
        FriendlistModel friendlist5 = new FriendlistModel(R.drawable.friend5, "Farid");
        friendlistModel.add(friendlist5);
        FriendlistModel friendlist6 = new FriendlistModel(R.drawable.friend6, "Salman");
        friendlistModel.add(friendlist6);

        recyclerViewFriendlist.setAdapter(new FriendlistAdapter(friendlistModel));

        return root;
    }
}