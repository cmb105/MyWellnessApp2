package dte.masteriot.mdp.mywellnessapp.ui.acc;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class AccViewModel extends ViewModel{
    private final MutableLiveData<String> mText;

    public AccViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is acc fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}






