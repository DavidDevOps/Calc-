package com.calculator.calc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragment;

public class MenuFragment extends SherlockFragment {

	ListView listView;

	public MenuFragment() {
		setRetainInstance(true);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		String[] data = { "기본 계산기", "단위 계산기", "날짜 계산기", "시간 계산기", "환율 계산기", "시급 계산기", /*"학점 계산기", */"할인 계산기", "BMI 계산기"};

		View v = inflater.inflate(R.layout.menu_frame, container, false);

		// 기본 변수 선언
		listView = (ListView) v.findViewById(R.id.list);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new ListView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> a, View vi, int pos, long id) {
				Fragment newContent = null;

				switch (pos) {
					case 0:
						newContent = new Normal();
						break;
					case 1:
						newContent = new Unit();
						break;
                    case 2:
                        newContent = new Month();
                        break;
                    case 3:
                        newContent = new Hour();
                        break;
                    case 4:
                        newContent = new Rate();
                        break;
                    case 5:
                        newContent = new HourlyWage();
                        break;
                    //case 6:
                        // 학점
                      //  break;
					case 6:
                        newContent = new Sail();
						break;
                    case 7:
                        newContent = new BMI();
                        break;
				}

				if (newContent != null)
					switchFragment(newContent);
			}
		});

		return v;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}

	private void switchFragment(Fragment fragment) {
		if (getActivity() == null)
			return;
		if (getActivity() instanceof MainActivity) {
			MainActivity fca = (MainActivity) getActivity();
			fca.switchContent(fragment);
		}
	}
}