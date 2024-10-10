<h1>[코딩 기초 트레이닝] 등차수열의 특정한 항만 더하기</h1>

<a href="https://school.programmers.co.kr/learn/courses/30/lessons/181930">👉 문제 보러가기</a>

<h2>성능 요약</h2>
<b>시간:0.03ms, 메모리 : 71.6MB</b>

<h2>문제 설명</h2>
<b>두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.</b><br>

<hr>

<h3>제한사항</h3>
<ul>
    <li>1 ≤ a ≤ 100</li>
    <li>1 ≤ d ≤ 100</li>
    <li>1 ≤ included의 길이 ≤ 100</li>
    <li>included에는 true가 적어도 하나 존재합니다.</li>
</ul>

<hr>

<h3>입출력 예</h3>
<table>
    <tr>
        <th>a</th>
        <th>b</th>
        <th>included</th>
        <th>result</th>
    </tr>
    <tr>
        <td>3</td>
        <td>4</td>
        <td>[true, false, false, true, true]</td>
        <td>37</td>
    </tr>
    <tr>
        <td>7</td>
        <td>1</td>
        <td>[false, false, false, true, false, false, false]</td>
        <td>10</td>
    </tr>
</table>

<hr>

<h3>입출력 예시 #1</h3>
<ul>
    <li>예제 1번은 a와 d가 각각 3, 4이고 included의 길이가 5입니다. 이를 표로 나타내면 다음과 같습니다.</li>
</ul>
<p>||1항|2항|3항|4항|5항|
<br>
|-|-|---|---|---|---|
<br>
|등차수열|3|7|11|15|19|
<br>
|included|true|false|false|true|true|</p>
<table><tr>따라서 true에 해당하는 1항, 4항, 5항을 더한 3 + 15 + 19 = 37을 return 합니다.</tr></table>

<h3>입출력 예시 #2</h3>
<ul>
    <li>예제 2번은 a와 d가 각각 7, 1이고 included의 길이가 7입니다. 이를 표로 나타내면 다음과 같습니다.</li>
</ul>
<p>||1항|2항|3항|4항|5항|6항|7항|
<br>
|-|-|---|---|---|---|---|---|
<br>
|등차수열|7|8|9|10|11|12|13|
<br>
|included|false|false|false|true|false|false|false|</p>
<table><tr>따라서 4항만 true이므로 10을 return 합니다.</tr></table>



<hr>

<a href="https://school.programmers.co.kr/">출처: 프로그래머스 코딩 테스트 연습 </a>