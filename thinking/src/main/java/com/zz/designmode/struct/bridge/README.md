创建一个播放器，可以播放RMVB，AVI，MPEG格式视频，可能在win，unix，linux平台


Video video = new RMVBVideo();
VideoImpl = new WinVideoImpl();
video.setVideoImpl(videoImpl)
video.play();

out:
解析rmvb格式，在Win中播放
