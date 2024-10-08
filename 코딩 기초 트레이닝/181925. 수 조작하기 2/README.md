<h1>[코딩 기초 트레이닝] 수 조작하기 2</h1>

<a href="https://school.programmers.co.kr/learn/courses/30/lessons/181925">👉 문제 보러가기</a>

<h2>성능 요약</h2>
<b>시간: 29.28ms, 메모리 : 113MB</b>

<h2>문제 설명</h2>
<b>정수 배열 numLog가 주어집니다. 처음에 numLog[0]에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.</b><br>

<ul>
    <li>"w" : 수에 1을 더한다.</li>
    <li>"s" : 수에 1을 뺀다.</li>
    <li>"d" : 수에 10을 더한다.</li>
    <li>"a" : 수에 10을 뺀다.</li>
</ul>
<b>그리고 매번 조작을 할 때마다 결괏값을 기록한 정수 배열이 numLog입니다. 즉, numLog[i]는 numLog[0]로부터 총 i번의 조작을 가한 결과가 저장되어 있습니다.</b><br>
<b>주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 return 하는 solution 함수를 완성해 주세요.</b>

<hr>

<h3>제한사항</h3>
<ul>
    <li>2 ≤ numLog의 길이 ≤ 100,000</li>
    <ul>
        <li>-100,000 ≤ numLog[0] ≤ 100,000</li>
        <li>1 ≤ i ≤ numLog의 길이인 모든 i에 대해 |numLog[i] - numLog[i - 1]|의 값은 1 또는 10입니다.</li>
    </ul>
</ul>

<hr>

<h3>입출력 예</h3>
<table>
    <tr>
        <th>numLog</th>
        <th>result</th>
    </tr>
    <tr>
        <td>[0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1]</td>
        <td>"wsdawsdassw"</td>
    </tr>
</table>

<hr>

<h3>입출력 예시 #1</h3>
<ul>
    <li>result인 "wsdawsdassw"를 따라 numLog[0]에서부터 시작해 조작을 하면 numLog의 값과 순서대로 일치합니다. 따라서 "wsdawsdassw"를 return 합니다.</li>
</ul>

<hr>

<h3>Hint</h3>
<ul>
    <li>"수 조작하기 1" 문제의 n값이 numLog[0]에 해당하며, 이 문제에서 주어진 numLog에 따라 "수 조작하기 1" 문제의 control을 구하는 문제라고 이해할 수 있습니다.</li>
    <li>입출력 예 #1은 "수 조작하기 1" 문제의 입출력 예 #1과 같은 예시이므로 참고하시기 바랍니다.</li>
</ul>

<hr>

<a href="https://school.programmers.co.kr/">출처: 프로그래머스 코딩 테스트 연습 </a>