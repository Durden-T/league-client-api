package com.hawolt.virtual.leagueclient.userinfo.child;

import com.hawolt.logger.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created: 10/01/2023 22:22
 * Author: Twitter @hawolt
 **/

public class UserInformationBanRestrictionData {
    private final UserInformationBanRestrictionGameData userInformationBanRestrictionGameData;

    public UserInformationBanRestrictionData(JSONObject o) {
        JSONObject gameData;
        try {
            gameData =o.getJSONObject("gameData");
        } catch (JSONException var4) {
            this.userInformationBanRestrictionGameData = null;
            Logger.error(var4);
            return;
        }
        this.userInformationBanRestrictionGameData =new UserInformationBanRestrictionGameData(gameData);
    }

    public UserInformationBanRestrictionGameData getUserInformationBanRestrictionGameData() {
        return userInformationBanRestrictionGameData;
    }

    @Override
    public String toString() {
        return "UserInformationBanRestrictionData{" +
                "userInformationBanRestrictionGameData=" + userInformationBanRestrictionGameData +
                '}';
    }
}
