import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Meditation App',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: HomeScreen(),
    );
  }
}

class HomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Meditation App'),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text(
              'Welcome to Meditation App',
              style: TextStyle(fontSize: 24),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(builder: (context) => MeditationScreen()),
                );
              },
              child: Text('Start Meditation'),
            ),
          ],
        ),
      ),
    );
  }
}

class MeditationScreen extends StatefulWidget {
  @override
  _MeditationScreenState createState() => _MeditationScreenState();
}

class _MeditationScreenState extends State<MeditationScreen> {
  int _timer = 10; // 10 minutes
  bool _isRunning = false;

  void _startTimer() {
    setState(() {
      _isRunning = true;
    });
    Timer.periodic(Duration(second: 1), (timer) {
      setState(() {
        if (_timer > 0) {
          _timer--;
        } else {
          _isRunning = false;
          timer.cancel();
        }
      });
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Meditation'),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text(
              'Meditation Timer',
              style: TextStyle(fontSize: 24),
            ),
            SizedBox(height: 20),
            Text(
              '$_timer minutes',
              style: TextStyle(fontSize: 48),
            ),
            SizedBox(height: 20),
            _isRunning
               ? ElevatedButton(
                    onPressed: () {
                      setState(() {
                        _isRunning = false;
                      });
                    },
                    child: Text('Pause'),
                  )
                : ElevatedButton(
                    onPressed: _startTimer,
                    child: Text('Start'),
                  ),
          ],
        ),
      ),
    );
  }
}