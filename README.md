<h1 align="center" style="font-weight: bold;"><img src="https://raw.githubusercontent.com/Tarikul-Islam-Anik/Animated-Fluent-Emojis/master/Emojis/Objects/Keyboard.png" alt="Keyboard" width="25" height="25" /> Syntactic Analyzer - First and Follow</h1>

<p align="center">
 <a href="#layout">Layout</a> • 
 <a href="#tech">Technologies</a> • 
 <a href="#language">Analyzed Language</a> • 
 <a href="#first-follow">First and Follow</a> • 
 <a href="#syntactic-table">Syntactic Analysis Table</a> • 
 <a href="#colab">Collaborators</a> •
 <a href="#license">License</a>
</p>

<p align="center">
    <b>Syntactic analyzer capable of validating the analyzed language and returning whether the value is valid, made in C# and Java</b>
</p>

<h2 id="layout">🎨 Layout</h2>

<p align="center">
    <img src="./assets/img/screens/screen01.png" alt="Screen 1" width="400px">
    <img src="./assets/img/screens/screen02.png" alt="Screen 2" width="380px">
    <img src="./assets/img/screens/screen03.png" alt="Screen 3" width="377px">
    <img src="./assets/img/screens/screen04.png" alt="Screen 4" width="400px">
    <img src="./assets/img/screens/screen05.png" alt="Screen 5" width="377px">
    <img src="./assets/img/screens/screen06.png" alt="Screen 6" width="400px">
    <img src="./assets/img/screens/screen07.png" alt="Screen 7" width="400px">
</p>

<h2 id="tech">💻 Technologies</h2>

[![My Skills](https://skillicons.dev/icons?i=cs,visualstudio,java,maven,eclipse)](https://skillicons.dev)

<h2 id="language"><img src="https://raw.githubusercontent.com/Tarikul-Islam-Anik/Animated-Fluent-Emojis/master/Emojis/Objects/Page%20Facing%20Up.png" alt="Page Facing Up" width="20" height="20" /> Analyzed Language</h2>

<table>
  <tr>
    <td align="center">
          <b>S</b>
    </td>
    <td align="center">
          <b>Aa</b>
    </td>
  </tr>
  <tr>
    <td align="center">
          <b>A</b>
    </td>
    <td align="center">
          <b>BD</b>
    </td>
  </tr>
  <tr>
    <td align="center">
          <b>B</b>
    </td>
    <td align="center">
          <b>b | ε</b>
    </td>
  </tr>
  <tr>
    <td align="center">
          <b>D</b>
    </td>
    <td align="center">
          <b>d | ε</b>
    </td>
  </tr>
</table>

<h2 id="first-follow"><img src="https://raw.githubusercontent.com/Tarikul-Islam-Anik/Animated-Fluent-Emojis/master/Emojis/Symbols/Chequered%20Flag.png" alt="Chequered Flag" width="20" height="20" /> First and Follow</h2>

<table>
  <tr>
    <td align="center">
          <b>Non-terminal</b>
    </td>
    <td align="center">
          <b>First</b>
    </td>
    <td align="center">
          <b>Follow</b>
    </td>
  </tr>
  <tr>
    <td align="center">
          <b>S</b>
    </td>
    <td align="center">
          <b>{b, d, a}</b>
    </td>
    <td align="center">
          <b>{$}</b>
    </td>
  </tr>
  <tr>
    <td align="center">
          <b>A</b>
    </td>
    <td align="center">
          <b>{b, d, ε}</b>
    </td>
    <td align="center">
          <b>{a}</b>
    </td>
  </tr>
  <tr>
    <td align="center">
          <b>B</b>
    </td>
    <td align="center">
          <b>{b, ε}</b>
    </td>
    <td align="center">
          <b>{d}</b>
    </td>
  </tr>
   <tr>
    <td align="center">
          <b>D</b>
    </td>
    <td align="center">
          <b>{d, ε}</b>
    </td>
    <td align="center">
          <b>{a}</b>
    </td>
  </tr>
</table>

<h2 id="syntactic-table"><img src="https://raw.githubusercontent.com/Tarikul-Islam-Anik/Animated-Fluent-Emojis/master/Emojis/Objects/Open%20Book.png" alt="Open Book" width="20" height="20" /> Syntactic Analysis Table</h2>

<table>
  <tr>
    <td align="center">
          <b></b>
    </td>
    <td align="center">
          <b>a</b>
    </td>
    <td align="center">
          <b>b</b>
    </td>
    <td align="center">
          <b>d</b>
    </td>
    <td align="center">
          <b>$</b>
    </td>
  </tr>
  <tr>
    <td align="center">
          <b>S</b>
    </td>
    <td align="center">
          <b>S → Aa</b>
    </td>
    <td align="center">
          <b>S → Aa</b>
    </td>
    <td align="center">
          <b>S → Aa</b>
    </td>
    <td align="center">
          <b></b>
    </td>
  </tr>
  <tr>
    <td align="center">
          <b>A</b>
    </td>
    <td align="center">
          <b>A → BD</b>
    </td>
    <td align="center">
          <b>A → BD</b>
    </td>
    <td align="center">
          <b>A → BD</b>
    </td>
    <td align="center">
          <b></b>
    </td>
  </tr>
  <tr>
    <td align="center">
          <b>B</b>
    </td>
    <td align="center">
          <b></b>
    </td>
    <td align="center">
          <b>B → b</b>
    </td>
    <td align="center">
          <b>B → ε</b>
    </td>
    <td align="center">
          <b></b>
    </td>
  </tr>
   <tr>
    <td align="center">
          <b>D</b>
    </td>
    <td align="center">
          <b>D → ε</b>
    </td>
    <td align="center">
          <b></b>
    </td>
    <td align="center">
          <b>D → d</b>
    </td>
    <td align="center">
          <b></b>
    </td>
  </tr>
</table>

<h2 id="colab">🤝 Collaborators</h2>

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/lucassantuss">
        <img src="https://github.com/lucassantuss.png" width="100px;" alt="Lucas Profile Picture"/><br>
          <b>Lucas Araujo</b>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/victorsi1va">
        <img src="https://github.com/victorsi1va.png" width="100px;" alt="Victor Profile Picture"/><br>
          <b>Victor Nunes</b>
      </a>
    </td>
  </tr>
</table>

<h2 id="license">🧾 License</h2>

This software is available under the following licenses:

- [MIT](LICENSE)
