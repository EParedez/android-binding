package bibleandroid.apps.bereasoftware.org.databindandroid6;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import bibleandroid.apps.bereasoftware.org.databindandroid6.databinding.LayoutBindingBinding;

/**
 * Created by eparedes on 22/09/15.
 */
public class ActividadBindiable extends Activity {
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.layout_binding);
        user = new User("Juan", "Perez");
        binding.setUser(user);
    }

    public void onButtonClick(View view) {
        Toast.makeText(this, "CLICKED", Toast.LENGTH_LONG).show();
        user.setLastName("Sanchez");
    }

}
