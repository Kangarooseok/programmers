<h1>[코딩 기초 트레이닝] 마지막 두 원소</h1>

<a href="https://school.programmers.co.kr/learn/courses/30/lessons/181927">👉 문제 보러가기</a>

<h2>성능 요약</h2>
<b>시간: 0.02ms, 메모리 : 72MB</b>

<h2>문제 설명</h2>
<b>정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.</b><br>

<hr>

<h3>제한사항</h3>
<ul>
    <li>2 ≤ num_list의 길이 ≤ 10</li>
    <li>1 ≤ num_list의 원소 ≤ 9</li>
</ul>

<hr>

<h3>입출력 예</h3>
<table>
    <tr>
        <th>num_list</th>
        <th>result</th>
    </tr>
    <tr>
        <td>[2, 1, 6]</td>
        <td>[2, 1, 6, 5]</td>
    </tr>
    <tr>
        <td>[5, 2, 1, 7, 5]	</td>
        <td>[5, 2, 1, 7, 5, 10]</td>
    </tr>
</table>

<hr>

<h3>입출력 예시 #1</h3>
<ul>
    <li>마지막 원소인 6이 그전 원소인 1보다 크기 때문에 6 - 1인 5를 추가해 return합니다.</li>
</ul>

<h3>입출력 예시 #2</h3>
<ul>
    <li>마지막 원소인 5가 그전 원소인 7보다 크지 않기 때문에 5의 두 배인 10을 추가해 return합니다.</li>
</ul>

<hr>

<a href="https://school.programmers.co.kr/">출처: 프로그래머스 코딩 테스트 연습 </a>