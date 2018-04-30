核心：将一个接口实现为不同的接口

已知,德国插座接口，中国插座接口，
求：德国设备到中国也可以用。




GBSocketInterface gbSocket = new GBSocket();

Hotel germanyDevice = new Hotel();

SocketAdapter socketAdapter = new SocketAdapter(gbSocket);

germanyDevice.setSocket(socketAdapter);

germanyDevice.charge();