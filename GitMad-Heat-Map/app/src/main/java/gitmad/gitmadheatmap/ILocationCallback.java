package gitmad.gitmadheatmap;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

/**
 * Simple callback interface.
 */
public interface ILocationCallback {
    void onFinish(List<LatLng> locations);
}
