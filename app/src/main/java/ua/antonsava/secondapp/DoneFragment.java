package ua.antonsava.secondapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Apple on 20.04.2016.
 */
public class DoneFragment extends Fragment {

    private List<TabRecycleViewData> mImageList = new ArrayList<>();

    public DoneFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater
            , ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.makes_layout, container, false);
        RecyclerView mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_tab);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        reciveDataImage();
        TabRecyclerAdapter mAdapter = new TabRecyclerAdapter( getActivity(), mImageList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }

    private void reciveDataImage() {
        TabRecycleViewData data = new TabRecycleViewData(R.drawable.ic_sport, R.drawable.ic_like, "Спортивна подія"
                , "вул.Савченко 22, м.Дніпропетровськ", "22 квітня 2016", "7 днів");
        mImageList.add(data);
        data = new TabRecycleViewData(R.drawable.ic_sport, R.drawable.ic_like, "Спортивна подія"
                , "вул.Кедріна 47, м.Дніпропетровськ", "18 квітня 2016", "5 днів" );
        mImageList.add(data);
        data = new TabRecycleViewData(R.drawable.ic_social, R.drawable.ic_like, "Соціальна подія"
                , "вул.Карла Маркса 60, м.Дніпропетровськ", "15 квітня 2016", "3 днів" );
        mImageList.add(data);
        data = new TabRecycleViewData(R.drawable.ic_sport, R.drawable.ic_like, "Спортивна подія"
                , "вул.Глінкі 17, м.Дніпропетровськ", "17 квітня 2016", "12 днів" );
        mImageList.add(data);
        data = new TabRecycleViewData(R.drawable.ic_sport, R.drawable.ic_like, "Спортивна подія"
                , "вул.Шевченка 94, м.Дніпропетровськ ", "13 квітня 2016", "7 днів");
        mImageList.add(data);
        data = new TabRecycleViewData(R.drawable.ic_party,  R.drawable.ic_like, "Розважальна подія"
                , "вул.Кірова 5, м.Дніпропетровськ ", "3 квітня 2016", "5 днів");
        mImageList.add(data);
        data = new TabRecycleViewData(R.drawable.ic_social, R.drawable.ic_like, "Соціальна подія"
                , "вул.Гагаріна 175, м.Дніпропетровськ ", "9 квітня 2016", "9 днів");
        mImageList.add(data);
        data = new TabRecycleViewData(R.drawable.ic_sport, R.drawable.ic_like, "Спортивна подія"
                , "вул.Тітова 1, м.Дніпропетровськ ", "9 квітня 2016", "5 днів" );
        mImageList.add(data);
        data = new TabRecycleViewData(R.drawable.ic_party, R.drawable.ic_like, "Розважальна подія"
                , "вул.Робоча 122, м.Дніпропетровськ ", "3 квітня 2016", "7 днів" );
        mImageList.add(data);
        data = new TabRecycleViewData(R.drawable.ic_sport, R.drawable.ic_like, "Спортивна подія"
                , "вул.Перемоги 145, м.Дніпропетровськ ", "20 квітня 2016", "9 днів");
        mImageList.add(data);

    }
}
