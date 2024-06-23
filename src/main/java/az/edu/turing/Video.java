package az.edu.turing;

import java.time.LocalDate;
import java.util.Objects;

public class Video {
    private Long videoId;
    private String shareDate;
    private long shareCount;
    private long likeCount;
    private long commentsCount;
    private long saveCount;
    String soundPath;

    private static long MaxId = 0;

    public Video(String shareDate, long shareCount, long likeCount, long commentsCount, long saveCount, String soundPath) {
        this.videoId = ++MaxId;
        this.shareDate = shareDate;
        this.shareCount = shareCount;
        this.likeCount = likeCount;
        this.commentsCount = commentsCount;
        this.saveCount = saveCount;
        this.soundPath = soundPath;
    }

    public Video (){
        this.videoId = ++MaxId;
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setSoundPath(String soundPath) {
        this.soundPath = soundPath;
    }

    public String getSoundPath() {
        return soundPath;
    }

    public String getShareDate() {
        return shareDate;
    }

    public void setShareDate(String shareDate) {
        this.shareDate = shareDate;
    }

    public long getShareCount() {
        return shareCount;
    }

    public void setShareCount(long shareCount) {
        this.shareCount = shareCount;
    }

    public long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(long likeCount) {
        this.likeCount = likeCount;
    }

    public long getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(long commentsCount) {
        this.commentsCount = commentsCount;
    }



    public long getSaveCount() {
        return saveCount;
    }

    public void setSaveCount(long saveCount) {
        this.saveCount = saveCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return shareCount == video.shareCount && likeCount == video.likeCount && commentsCount == video.commentsCount  && saveCount == video.saveCount && Objects.equals(videoId, video.videoId) && Objects.equals(shareDate, video.shareDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoId, shareDate, shareCount, likeCount, commentsCount, saveCount);
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoId=" + videoId +
                ", shareDate=" + shareDate +
                ", shareCount=" + shareCount +
                ", likesCount=" + likeCount +
                ", commentsCount=" + commentsCount +
                ", savedVideoCount=" + saveCount +
                '}';
    }

}