package az.edu.turing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.stream.Collectors;

public class TikTokAPIRequest {
    public static void main(String[] args) {
        String url = "https://www.tiktok.com/api/explore/item_list/";

        // Prepare the parameters
        Map<String, String> params = new HashMap<>();
        params.put("WebIdLastTime", "1719086090");
        params.put("aid", "1988");
        params.put("app_language", "tr-TR");
        params.put("app_name", "tiktok_web");
        params.put("browser_language", "tr-TR");
        params.put("browser_name", "Mozilla");
        params.put("browser_online", "true");
        params.put("browser_platform", "MacIntel");
        params.put("browser_version", "5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.6422.112 Safari/537.36");
        params.put("categoryType", "120");
        params.put("channel", "tiktok_web");
        params.put("clientABVersions", "70508271,72135781,72213608,72301549,72313477,72317344,72322055,72339010,72352610,72364001,72367934,72373486,72381911,72386448,72392489,72402045,72407627,72420208,72424767,70405643,71057832,71200802,72445639");
        params.put("cookie_enabled", "true");
        params.put("count", "16");
        params.put("device_id", "7383418438074697221");
        params.put("device_platform", "web_pc");
        params.put("focus_state", "true");
        params.put("from_page", "");
        params.put("history_len", "3");
        params.put("is_fullscreen", "false");
        params.put("is_page_visible", "true");
        params.put("language", "tr");
        params.put("odinId", "7383417905222468614");
        params.put("os", "windows");
        params.put("priority_region", "");
        params.put("referer", "");
        params.put("region", "TR");
        params.put("screen_height", "900");
        params.put("screen_width", "1440");
        params.put("tz_name", "Europe/Istanbul");
        params.put("verifyFp", "verify_lxqjh4nf_UAZ8PxY1_7ZIY_4aqT_9bfa_d8pr9ZlcjIhS");
        params.put("webcast_language", "tr-TR");

        // Prepare the headers
        Map<String, String> headers = new HashMap<>();
        headers.put("Host", "www.tiktok.com");
        headers.put("Cookie", "tt_csrf_token=u6wZRTvv-nRQQuVNNrW8_iZ1OPVKlT2KdoXA; tt_chain_token=/Tc1/AvPmFB+yGvHaBy9HA==; ak_bmsc=F112D48F7D331F80C9E0F7C0B4C84CB6~000000000000000000000000000000~YAAQjthUuK8aqzeQAQAALgqEQRhzOnwUUfQEODuw8Q66oRTj+B4OB9vYxfDel9l6zgTKmb3MpUW+Xx1bXN6lPYg51euj2aKsbtCZ7TqgdyHnwEYdhyqFBtJeZSzCjUe260cqjJvlMuspavEK9MJjPT75jht9PHuVvEN2Qz/qFVMHvek54f0xvGpI5SgqdQ74splnS1Dd+omYOLhX9epGN4I4XN4pBpXfP6oxmDo9CQLS9d5QTRBGCd+S4s/ufEtt9MyGehCBR/QGOjFMlm87AzUZqPVLaGMHdoJiXR6Owum6lW1qnUNfSI+uSFeLHnlnFMo/FtkpV8KyV1w2q2XoB8rz4UyWRpvWlrndO6FgEu5wMvQobhvDoM/wLEtH7BEDoH1fkrcRvkh6FA==; tiktok_webapp_theme_auto_dark_ab=1; tiktok_webapp_theme=system; ttwid=1%7CCSP0n70pjsHnKFWcSagDT1fe6CumFfmcATIZjWo7mi8%7C1719086094%7C8d9fa867ac0bb72b55d2f181f951c1da7c175493adf7a6544cd5642bf2b49ee4; s_v_web_id=verify_lxqjh4nf_UAZ8PxY1_7ZIY_4aqT_9bfa_d8pr9ZlcjIhS; msToken=GlAmH4XkBZHszQNkn7Lbjsco-C_0FAyOBk68EefiKPIf_4L5RgPw_xMi63WetiGM3l1ssg4whmI7JWNT_8foGlm3MlueIFpMBkccUssZ9RvkdVhtvlgdspMZPbxq3Xxxe3J4_7pL1hNUhtUl9CU=; msToken=XHmS8_s-YhHcOz2300_hAxZLPJ1W3FPWW48fiMUUru0lSYqCxhuuAbTsgHDUD8UiZm9S9w7T6JzzEA8DSktTQIjcBX8YVAgwTlo2ggk5OCq-BhGmIdJm29ipCw==; perf_feed_cache={%22expireTimestamp%22:1719255600000%2C%22itemIds%22:[%227379656514618854662%22%2C%227378861355077569797%22%2C%227378917188792601861%22]}; cookie-consent={%22ga%22:true%2C%22af%22:true%2C%22fbp%22:true%2C%22lip%22:true%2C%22bing%22:true%2C%22ttads%22:true%2C%22reddit%22:true%2C%22hubspot%22:true%2C%22version%22:%22v10%22}");
        headers.put("Sec-Ch-Ua", "\"Chromium\";v=\"125\", \"Not.A/Brand\";v=\"24\"");
        headers.put("Sec-Ch-Ua-Mobile", "?0");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.6422.112 Safari/537.36");
        headers.put("Sec-Ch-Ua-Platform", "\"macOS\"");
        headers.put("Accept", "/");
        headers.put("Sec-Fetch-Site", "same-origin");
        headers.put("Sec-Fetch-Mode", "cors");
        headers.put("Sec-Fetch-Dest", "empty");
        headers.put("Referer", "https://www.tiktok.com/explore");
        headers.put("Accept-Encoding", "gzip, deflate, br");
        headers.put("Accept-Language", "tr-TR,tr;q=0.9,en-US;q=0.8,en;q=0.7");
        headers.put("Priority", "u=1, i");

        try {
            String paramString = params.entrySet().stream()
                    .map(entry -> URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8) + "=" + URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8))
                    .collect(Collectors.joining("&"));

            URL requestUrl = new URL(url + "?" + paramString);
            HttpURLConnection connection = (HttpURLConnection) requestUrl.openConnection();
            connection.setRequestMethod("GET");

            // Set the headers
            for (Map.Entry<String, String> header : headers.entrySet()) {
                connection.setRequestProperty(header.getKey(), header.getValue());
            }

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in;
                String encoding = connection.getContentEncoding();
                if (encoding != null && encoding.equalsIgnoreCase("gzip")) {
                    in = new BufferedReader(new InputStreamReader(new GZIPInputStream(connection.getInputStream()), StandardCharsets.UTF_8));
                } else {
                    in = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
                }

                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Write response to file
                BufferedWriter writer = new BufferedWriter(new FileWriter("response.json"));
                writer.write(response.toString());
                writer.close();

                System.out.println("Response saved to response.json");
            } else {
                System.out.println("HTTP error code: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
